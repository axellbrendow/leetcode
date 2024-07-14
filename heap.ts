type Comparator<T> = (val1: T, val2: T) => number;

interface HeapConstructorArgs<T> {
  /**
   * Values to be inserted in the heap initially.
   */
  values?: T[];

  /**
   * Compares `a` and `b`. If a positive value is produced, `a` will be after `b`.
   * If a negative value is produced, `a` will be before `b`. Zero means `a` and `b`
   * will be one after the other but they can be swapped with each other.
   *
   * If you want elements in ascending order, you can use `(a, b) => a - b`
   *
   * If you want elements in descending order, you can use `(a, b) => b - a`
   *
   * For strings you can use `(a, b) => a.localeCompare(b)`.
   *
   * Default value: `(a, b) => a - b`
   */
  comparator?: Comparator<T>;
}

/** Min-heap by default */
class Heap<T> {
  private _values: T[];
  /**
   * Compares `a` and `b`. If a positive value is produced, `a` will be after `b`.
   * If a negative value is produced, `a` will be before `b`. Zero means `a` and `b`
   * will be one after the other but they can be swapped with each other.
   */
  private _comparator: Comparator<T>;

  constructor(args?: HeapConstructorArgs<T>) {
    this._values = [];
    this._comparator = args?.comparator || ((a: any, b: any) => a - b);
    this.validate();
    if (args?.values) this.pushAll(args.values);
  }

  private validate() {
    if (this._values && !Array.isArray(this._values)) {
      throw new Error("Heap this.data should be an array");
    }
    if (typeof this._comparator !== "function") {
      throw new Error("Heap this.comparator should be a function");
    }
  }

  private left = (i: number) => (i << 1) + 1;
  private hasLeft = (i: number) => this.left(i) < this._values.length;
  private leftValue = (i: number) => this._values[this.left(i)];

  private right = (i: number) => (i << 1) + 2;
  private hasRight = (i: number) => this.right(i) < this._values.length;
  private rightValue = (i: number) => this._values[this.right(i)];

  private parent = (i: number) => (i - 1) >> 1;
  private parentValue = (i: number) => this._values[this.parent(i)];

  private swap(i: number, j: number) {
    const tmp = this._values[i];
    this._values[i] = this._values[j];
    this._values[j] = tmp;
  }

  public isEmpty = () => this._values.length == 0;

  public peek() {
    if (!this.isEmpty()) {
      return this._values[0];
    }
  }

  private bubbleUp() {
    let i = this._values.length - 1;
    while (i > 0) {
      if (this._comparator(this._values[i], this.parentValue(i)) >= 0) break;
      this.swap(i, this.parent(i));
      i = this.parent(i);
    }
  }

  public push(value: T) {
    this._values.push(value);
    this.bubbleUp();
  }

  public pushAll = (values: T[]) => values.forEach(this.push, this);

  private bubbleDown() {
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

  public pop() {
    if (this.isEmpty()) return;
    const value = this.peek();
    const lastValue = this._values.pop() as T;
    if (!this.isEmpty()) {
      this._values[0] = lastValue;
    }
    this.bubbleDown();
    return value;
  }

  public *toStringRotated90DegreesCounterClockwise() {
    const self = this;
    function* dfs(i: number, depth: number): Generator<string> {
      if (i >= self._values.length) return;
      yield* dfs(self.right(i), depth + 1);
      yield "\t".repeat(depth) + self._values[i];
      yield* dfs(self.left(i), depth + 1);
    }
    yield* dfs(0, 0);
  }

  public print = () =>
    [...this.toStringRotated90DegreesCounterClockwise()].forEach((line) =>
      console.log(line)
    );
}

const heap = new Heap({
  values: [3, 2, 1, 4, -1, -5],
  comparator: (a, b) => a - b,
});

heap.print();

while (!heap.isEmpty()) {
  console.log(heap.pop());
}
