public class Array {
    private Element[] elements;

    public Array(int size) {
        this.elements = new Element[size];

    }

    public void setElement(int index, Element element) {
        elements[index] = element;
    }

    public Element getElement(int index) {
        return elements[index];
    }

    public int getSize() {
        return elements.length;
    }

    public Array add(Array array) {
        if (this.getSize() != array.getSize()) {
            throw new IllegalArgumentException("Массивы должны быть одного размера");
        }

        Array result = new Array(this.getSize());

        for (int i = 0; i < this.getSize(); i++) {
            int value = this.getElement(i).getValue() + array.getElement(i).getValue();
            Element element = new Element(value);
            result.setElement(i, element);
        }

        return result;
    }

    public Array subtract(Array array) {
        if (this.getSize() != array.getSize()) {
            throw new IllegalArgumentException("Массивы должны быть одного размера");
        }

        Array result = new Array(this.getSize());

        for (int i = 0; i < this.getSize(); i++) {
            int value = this.getElement(i).getValue() - array.getElement(i).getValue();
            Element element = new Element(value);
            result.setElement(i, element);
        }

        return result;
    }

    public Array multiply(Array array) {
        if (this.getSize() != array.getSize()) {
            throw new IllegalArgumentException("Массивы должны быть одного размера");
        }

        Array result = new Array(this.getSize());

        for (int i = 0; i < this.getSize(); i++) {
            int value = this.getElement(i).getValue() * array.getElement(i).getValue();
            Element element = new Element(value);
            result.setElement(i, element);
        }

        return result;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < this.getSize(); i++) {
            System.out.print(this.getElement(i).getValue());
            if (i != this.getSize() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
