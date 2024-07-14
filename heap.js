/** Min-heap by default */
class Heap {
  constructor(args) {
    this._values = [];
    /**
     * Compares `a` and `b`. If a positive value is produced, `a` will be after `b`.
     * If a negative value is produced, `a` will be before `b`. Zero means `a` and `b`
     * will be one after the other but they can be swapped with each other.
     */
    this._comparator = args?.comparator || ((a, b) => a - b);
    if (args?.values) this.pushAll(args.values);
  }

  left = (i) => (i << 1) + 1;
  hasLeft = (i) => this.left(i) < this._values.length;
  leftValue = (i) => this._values[this.left(i)];

  right = (i) => (i << 1) + 2;
  hasRight = (i) => this.right(i) < this._values.length;
  rightValue = (i) => this._values[this.right(i)];

  parent = (i) => (i - 1) >> 1;
  parentValue = (i) => this._values[this.parent(i)];

  swap(i, j) {
    const tmp = this._values[i];
    this._values[i] = this._values[j];
    this._values[j] = tmp;
  }

  isEmpty = () => this._values.length == 0;

  peek() {
    if (!this.isEmpty()) {
      return this._values[0];
    }
  }

  bubbleUp() {
    let i = this._values.length - 1;
    while (i > 0) {
      if (this._comparator(this._values[i], this.parentValue(i)) >= 0) break;
      this.swap(i, this.parent(i));
      i = this.parent(i);
    }
  }

  push(value) {
    this._values.push(value);
    this.bubbleUp();
  }

  pushAll = (values) => values.forEach(this.push, this);

  bubbleDown() {
    let i = 0;
    while (this.hasLeft(i)) {
      if (
        this.hasRight(i) &&
        this._comparator(this._values[i], this.rightValue(i)) > 0 &&
        this._comparator(this.rightValue(i), this.leftValue(i)) <= 0
      ) {
        this.swap(i, this.right(i));
        i = this.right(i);
      } else if (this._comparator(this._values[i], this.leftValue(i)) > 0) {
        this.swap(i, this.left(i));
        i = this.left(i);
      } else {
        break;
      }
    }
  }

  pop() {
    if (this.isEmpty()) return;
    const value = this.peek();
    const lastValue = this._values.pop();
    if (!this.isEmpty()) {
      this._values[0] = lastValue;
    }
    this.bubbleDown();
    return value;
  }
}

const heap = new Heap({
  values: [3, 2, 1, 4, -1, -5],
  comparator: (a, b) => a - b,
});

while (!heap.isEmpty()) {
  console.log(heap.pop());
}
