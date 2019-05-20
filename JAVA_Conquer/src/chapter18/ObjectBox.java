package chapter18;

public class ObjectBox {
	Object value;
	ObjectBox(Object value) { this.value = value; }
	Object getValue() { return value; }
	void setValue(Object value) { this.value = value; }
}
