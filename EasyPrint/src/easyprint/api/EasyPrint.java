package easyprint.api;

public class EasyPrint {
	private static char[] lowercase = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
			'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	private static char[] uppercase = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
			'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private static String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-_=+`~!@#$%^&*()[]{},./;<>?:|";

	// Print
	public static void print(Object toPrint) {
		System.out.print(toPrint);
	}

	public static void print(String[] toPrint) {
		System.out.print(convertToString(toPrint));
	}

	public static void print(char[] toPrint) {
		System.out.print(convertToString(toPrint));
	}

	public static void print(byte[] toPrint) {
		System.out.print(convertToString(toPrint));
	}

	public static void print(short[] toPrint) {
		System.out.print(convertToString(toPrint));
	}

	public static void print(long[] toPrint) {
		System.out.print(convertToString(toPrint));
	}

	public static void print(double[] toPrint) {
		System.out.print(convertToString(toPrint));
	}

	public static void print(int[] toPrint) {
		System.out.print(convertToString(toPrint));
	}

	public static void print(float[] toPrint) {
		System.out.print(convertToString(toPrint));
	}

	public static void print(boolean[] toPrint) {
		System.out.print(convertToString(toPrint));
	}

	// Print Line
	public static void println(Object toPrint) {
		System.out.println(toPrint);
	}

	public static void println(String[] toPrint) {
		System.out.println(convertToString(toPrint));
	}

	public static void println(char[] toPrint) {
		System.out.println(convertToString(toPrint));
	}

	public static void println(byte[] toPrint) {
		System.out.println(convertToString(toPrint));
	}

	public static void println(short[] toPrint) {
		System.out.println(convertToString(toPrint));
	}

	public static void println(long[] toPrint) {
		System.out.println(convertToString(toPrint));
	}

	public static void println(double[] toPrint) {
		System.out.println(convertToString(toPrint));
	}

	public static void println(int[] toPrint) {
		System.out.println(convertToString(toPrint));
	}

	public static void println(float[] toPrint) {
		System.out.println(convertToString(toPrint));
	}

	public static void println(boolean[] toPrint) {
		System.out.println(convertToString(toPrint));
	}

	// Misc
	public static void lineBreak() {
		System.out.println("");
	}

	public static void lineBreak(int breaks) {
		for (int i = 0; i < breaks; i++) {
			System.out.println("");
		}
	}

	public static String convertToString(Object convert) {
		return String.valueOf(convert);
	}

	public static String convertToString(String[] convert) {
		String converted = "";

		for (int i = 0; i < convert.length; i++) {
			if (i == convert.length - 1) {
				converted += String.valueOf(convert[i]);
			} else {
				converted += String.valueOf(convert[i]) + ", ";
			}
		}

		return converted;
	}

	public static String convertToString(char[] convert) {
		String converted = "";

		for (int i = 0; i < convert.length; i++) {
			if (i == convert.length - 1) {
				converted += String.valueOf(convert[i]);
			} else {
				converted += String.valueOf(convert[i]) + ", ";
			}
		}

		return converted;
	}

	public static String convertToString(byte[] convert) {
		String converted = "";

		for (int i = 0; i < convert.length; i++) {
			if (i == convert.length - 1) {
				converted += String.valueOf(convert[i]);
			} else {
				converted += String.valueOf(convert[i]) + ", ";
			}
		}

		return converted;
	}

	public static String convertToString(short[] convert) {
		String converted = "";

		for (int i = 0; i < convert.length; i++) {
			if (i == convert.length - 1) {
				converted += String.valueOf(convert[i]);
			} else {
				converted += String.valueOf(convert[i]) + ", ";
			}
		}

		return converted;
	}

	public static String convertToString(long[] convert) {
		String converted = "";

		for (int i = 0; i < convert.length; i++) {
			if (i == convert.length - 1) {
				converted += String.valueOf(convert[i]);
			} else {
				converted += String.valueOf(convert[i]) + ", ";
			}
		}

		return converted;
	}

	public static String convertToString(double[] convert) {
		String converted = "";

		for (int i = 0; i < convert.length; i++) {
			if (i == convert.length - 1) {
				converted += String.valueOf(convert[i]);
			} else {
				converted += String.valueOf(convert[i]) + ", ";
			}
		}

		return converted;
	}

	public static String convertToString(int[] convert) {
		String converted = "";

		for (int i = 0; i < convert.length; i++) {
			if (i == convert.length - 1) {
				converted += String.valueOf(convert[i]);
			} else {
				converted += String.valueOf(convert[i]) + ", ";
			}
		}

		return converted;
	}

	public static String convertToString(float[] convert) {
		String converted = "";

		for (int i = 0; i < convert.length; i++) {
			if (i == convert.length - 1) {
				converted += String.valueOf(convert[i]);
			} else {
				converted += String.valueOf(convert[i]) + ", ";
			}
		}

		return converted;
	}

	public static String convertToString(boolean[] convert) {
		String converted = "";

		for (int i = 0; i < convert.length; i++) {
			if (i == convert.length - 1) {
				converted += String.valueOf(convert[i]);
			} else {
				converted += String.valueOf(convert[i]) + ", ";
			}
		}

		return converted;
	}

	public static String reverse(String toReverse) {
		String reversed = "";

		for (int i = toReverse.length() - 1; i > -1; i--) {
			reversed += toReverse.charAt(i);
		}

		return reversed;
	}

	public static boolean arrayContains(String[] array, String contain) {
		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (array[i] == contain) {
					return true;
				} else if (array[array.length - i] == contain) {
					return true;
				}
			} else {
				return false;
			}
		}

		return false;
	}

	public static boolean arrayContains(char[] array, char contain) {
		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (array[i] == contain) {
					return true;
				} else if (array[array.length - 1 - i] == contain) {
					return true;
				}
			} else {
				return false;
			}
		}

		return false;
	}

	public static boolean arrayContains(byte[] array, byte contain) {
		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (array[i] == contain) {
					return true;
				} else if (array[array.length - 1 - i] == contain) {
					return true;
				}
			} else {
				return false;
			}
		}

		return false;
	}

	public static boolean arrayContains(short[] array, short contain) {
		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (array[i] == contain) {
					return true;
				} else if (array[array.length - 1 - i] == contain) {
					return true;
				}
			} else {
				return false;
			}
		}

		return false;
	}

	public static boolean arrayContains(long[] array, long contain) {
		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (array[i] == contain) {
					return true;
				} else if (array[array.length - 1 - i] == contain) {
					return true;
				}
			} else {
				return false;
			}
		}

		return false;
	}

	public static boolean arrayContains(double[] array, double contain) {
		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (array[i] == contain) {
					return true;
				} else if (array[array.length - 1 - i] == contain) {
					return true;
				}
			} else {
				return false;
			}
		}

		return false;
	}

	public static boolean arrayContains(int[] array, int contain) {
		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (array[i] == contain) {
					return true;
				} else if (array[array.length - 1 - i] == contain) {
					return true;
				}
			} else {
				return false;
			}
		}

		return false;
	}

	public static boolean arrayContains(float[] array, float contain) {
		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (array[i] == contain) {
					return true;
				} else if (array[array.length - 1 - i] == contain) {
					return true;
				}
			} else {
				return false;
			}
		}

		return false;
	}

	public static boolean arrayContains(boolean[] array, boolean contain) {
		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (array[i] == contain) {
					return true;
				} else if (array[array.length - 1 - i] == contain) {
					return true;
				}
			} else {
				return false;
			}
		}

		return false;
	}

	public static int indexOf(String[] array, String of) {
		int index = -1;

		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (of == array[i]) {
					index = i;
					return index;
				} else if (of == array[array.length - 1 - i]) {
					index = array.length - 1 - i;
					return index;
				}
			}
		}

		return index;
	}

	public static int indexOf(char[] array, char of) {
		int index = -1;

		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (of == array[i]) {
					index = i;
					return index;
				} else if (of == array[array.length - 1 - i]) {
					index = array.length - 1 - i;
					return index;
				}
			}
		}

		return index;
	}

	public static int indexOf(byte[] array, byte of) {
		int index = -1;

		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (of == array[i]) {
					index = i;
					return index;
				} else if (of == array[array.length - 1 - i]) {
					index = array.length - 1 - i;
					return index;
				}
			}
		}

		return index;
	}

	public static int indexOf(short[] array, short of) {
		int index = -1;

		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (of == array[i]) {
					index = i;
					return index;
				} else if (of == array[array.length - 1 - i]) {
					index = array.length - 1 - i;
					return index;
				}
			}
		}

		return index;
	}

	public static int indexOf(long[] array, long of) {
		int index = -1;

		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (of == array[i]) {
					index = i;
					return index;
				} else if (of == array[array.length - 1 - i]) {
					index = array.length - 1 - i;
					return index;
				}
			}
		}

		return index;
	}

	public static int indexOf(double[] array, double of) {
		int index = -1;

		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (of == array[i]) {
					index = i;
					return index;
				} else if (of == array[array.length - 1 - i]) {
					index = array.length - 1 - i;
					return index;
				}
			}
		}

		return index;
	}

	public static int indexOf(int[] array, int of) {
		int index = -1;

		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (of == array[i]) {
					index = i;
					return index;
				} else if (of == array[array.length - 1 - i]) {
					index = array.length - 1 - i;
					return index;
				}
			}
		}

		return index;
	}

	public static int indexOf(float[] array, float of) {
		int index = -1;

		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (of == array[i]) {
					index = i;
					return index;
				} else if (of == array[array.length - 1 - i]) {
					index = array.length - 1 - i;
					return index;
				}
			}
		}

		return index;
	}

	public static int indexOf(boolean[] array, boolean of) {
		int index = -1;

		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				if (of == array[i]) {
					index = i;
					return index;
				} else if (of == array[array.length - 1 - i]) {
					index = array.length - 1 - i;
					return index;
				}
			}
		}

		return index;
	}

	public static String Uppercase(String toUppercase) {
		String uppercased = "";

		for (int i = 0; i < toUppercase.length(); i++) {
			if (arrayContains(lowercase, toUppercase.charAt(i))) {
				uppercased += uppercase[indexOf(lowercase, toUppercase.charAt(i))];
			} else {
				uppercased += convertToString(toUppercase.charAt(i));
			}
		}

		return uppercased;
	}

	public static String Lowercase(String toLowercase) {
		String lowercased = "";

		for (int i = 0; i < toLowercase.length(); i++) {
			if (arrayContains(uppercase, toLowercase.charAt(i))) {
				lowercased += lowercase[indexOf(uppercase, toLowercase.charAt(i))];
			} else {
				lowercased += convertToString(toLowercase.charAt(i));
			}
		}

		return lowercased;
	}

	public static String ProperNoun(String toProper) {
		String proper = "";

		for (int i = 0; i < toProper.length(); i++) {
			if (i == 0) {
				proper += Uppercase(convertToString(toProper.charAt(i)));
			} else {
				proper += Lowercase(convertToString(toProper.charAt(i)));
			}
		}

		return proper;
	}

	public static char[] GetAlphabetLowercase() {
		return lowercase;
	}

	public static char[] GetAlphabetUppercase() {
		return uppercase;
	}

	public static String GetCharacters() {
		return characters;
	}

	public static int[] bubbleSort(int[] toSort) {
		int[] sortedArray = toSort;

		int n = sortedArray.length;
		int temp = 0;

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (sortedArray[j + 1] < sortedArray[j]) {
					temp = sortedArray[j + 1];
					sortedArray[j + 1] = sortedArray[j];
					sortedArray[j] = temp;
				}
			}
		}

		return sortedArray;
	}

	public static short[] bubbleSort(short[] toSort) {
		short[] sortedArray = toSort;

		int n = sortedArray.length;
		short temp = 0;

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (sortedArray[j + 1] < sortedArray[j]) {
					temp = sortedArray[j + 1];
					sortedArray[j + 1] = sortedArray[j];
					sortedArray[j] = temp;
				}
			}
		}

		return sortedArray;
	}

	public static long[] bubbleSort(long[] toSort) {
		long[] sortedArray = toSort;

		long n = sortedArray.length;
		long temp = 0;

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (sortedArray[j + 1] < sortedArray[j]) {
					temp = sortedArray[j + 1];
					sortedArray[j + 1] = sortedArray[j];
					sortedArray[j] = temp;
				}
			}
		}

		return sortedArray;
	}

	public static float[] bubbleSort(float[] toSort) {
		float[] sortedArray = toSort;

		int n = sortedArray.length;
		float temp = 0;

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (sortedArray[j + 1] < sortedArray[j]) {
					temp = sortedArray[j + 1];
					sortedArray[j + 1] = sortedArray[j];
					sortedArray[j] = temp;
				}
			}
		}

		return sortedArray;
	}

	public static double[] bubbleSort(double[] toSort) {
		double[] sortedArray = toSort;

		int n = sortedArray.length;
		double temp = 0;

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (sortedArray[j + 1] < sortedArray[j]) {
					temp = sortedArray[j + 1];
					sortedArray[j + 1] = sortedArray[j];
					sortedArray[j] = temp;
				}
			}
		}

		return sortedArray;
	}
}
