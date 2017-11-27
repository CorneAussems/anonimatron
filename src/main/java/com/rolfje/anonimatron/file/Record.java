package com.rolfje.anonimatron.file;

public class Record {
	final String[] names;
	final Object[] values;

	public Record(String[] names, Object[] values) {
		if (names.length != values.length) {
			throw new IllegalArgumentException("Argument Arrays need to be the same size.");
		}
		this.names = names;
		this.values = values;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("[Record: ");
		if (names != null) {
			for (int i = 0; i < names.length; i++) {
				stringBuilder.append(names[i]);
				stringBuilder.append(":");
				stringBuilder.append("'" + values + "' ");
			}
		}

		stringBuilder.append("]");
		return stringBuilder.toString();
	}
}