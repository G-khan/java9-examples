# Java 9  Features Example 

## Features:
 - **Private Methods in Interface:** Encapsulation is possible in interface that mean you can avoid code duplication in default methods. Also private interface methods can be *static* or *instance*. 
      _see_: Magician class prepareForMagic method
    
 - **Optional Class Improvements**  _see_: Spectators class
	  - Optional.ifPresentOrElse()
	  - Optional.or()
	  
 - **Immutable Collection Factory** _see_: Spectators class
	  - `List<String> names = List.of("Gokhan", "Ahmet", "Ayse");`
		  - Cannot set null item in to List.of: `java.lang.NullPointerException`
		  - Cannot add new item: `UnsupportedOperationException`
	  - `Set<String> names = Set.of("Gokhan", "Ahmet", "Ayse");`
		  - Cannot set null item in to List.of: `java.lang.NullPointerException`
		  - Cannot add new item: `UnsupportedOperationException`
		  - Cannot add duplicate item: `IllegalArgumentException`
	  - `Map<String,  String> immutableMap =  Map.of("Key1",  "Gokhan",  "Key2",  "Ahmet");`
		  - Cannot put new key value pair: `UnsupportedOperationException`


Example inspired by https://www.polidea.com/blog/Exploring-Java-9Private-Interface-Methods/
