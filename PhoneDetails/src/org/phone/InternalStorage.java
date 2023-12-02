package org.phone;

public class InternalStorage {
	private void processorName() {
		System.out.println("processorName");
	}

	private void ramsize() {
		System.out.println("12 gb ram");
	}

	public static void main(String[] args) {
		InternalStorage sz = new InternalStorage();
		sz.ramsize();
		sz.processorName();
		ExternalStorage esz = new ExternalStorage();
		esz.size();
	}
}
