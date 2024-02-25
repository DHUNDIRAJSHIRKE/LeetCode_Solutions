package q_676_ImplementMagicDictionary;

import java.util.ArrayList;

/*
Design a data structure that is initialized with a list of different words. 
Provided a string, you should determine if you can change exactly one character in this string to match any word in the data structure.

Implement the MagicDictionary class:

MagicDictionary() Initializes the object.
void buildDict(String[] dictionary) Sets the data structure with an array of distinct strings dictionary.
bool search(String searchWord) Returns true if you can change exactly one character in searchWord to match any string in the data structure, otherwise returns false.
*/

/*
Constraints:

1 <= dictionary.length <= 100
1 <= dictionary[i].length <= 100
dictionary[i] consists of only lower-case English letters.
All the strings in dictionary are distinct.
1 <= searchWord.length <= 100
searchWord consists of only lower-case English letters.
buildDict will be called only once before search.
At most 100 calls will be made to search.
*/

class MagicDictionary {

	ArrayList<String> list;

	public MagicDictionary() {
		list = new ArrayList<String>();
	}

	public void buildDict(String[] dictionary) {
		for (String str : dictionary) {
			list.add(str);
		}
	}

	public boolean search(String searchWord) {
		for (String str : list) {
			if (!str.equals(searchWord)) {
				if (str.length() == searchWord.length()) {
					if (oneDiff(searchWord, str)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static boolean oneDiff(String searchWord, String str) {
		int count = 0;
		char[] strChars = str.toCharArray();
		char[] wordChars = searchWord.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (strChars[i] != wordChars[i]) {
				count++;
			}
		}
		if (count == 1) {
			return true;
		}
		return false;
	}
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary(); obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */
