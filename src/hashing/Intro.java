package hashing;

public class Intro {

	/*
	 * Hashing:
	 * Intro:
	 * used to implement dictionaries & sets.
	 * search, insert,delete operations in O(1) an avg
	 * it works best for search, insert,delete operations
	 * not used for: finding closest value, sorted data, prefix searching
	 * 
	 * 
	 * Applications of Hashing:
	 * Dictionaries, 
	 * database indexing, 
	 * cryptography,
	 * caches,
	 * Symbol tables in compilers/interpreters
	 * routers
	 * getting data from DBs
	 * many more.......
	 * 
	 * 
	 * Direct Address Table:
	 * 
	 * 
	 * Hashing Functions:
	 * 
	 * take large keys use hashing functions and covert it into small values.
	 * 
	 * How hash functions work?
	 * =>hash function should generate value from 0 to m-1.
	 * should uniformly distribute large keys.
	 * sould be fast,  O(1) for integer & 
	 * 
	 * Ex. Hashnig functions:
	 * 
	 * 1]for large integers:  
	 *         h(large_key) = large_key%m
	 * 2] for Strings, weighted sum: str[]="abcd"
	 *        (str[0]*x^0 + str[1]*x^1 + str[2]*x^2 + str[3]*x^3)%m
	 * 
	 * 
	 * Collision Handling: When two or more keys have the same hash value, a collision happens.
	 * 
	 * if we know keys in advance, then we can perfect hashing
	 * 
	 * if we do not know keys, then we use one of the folllowing:
	 *   Chaining
	 *   Open Addressing: 
	 *          Linear probing
	 *          Quadratic probing
	 *          Double hashing.
	 * 
	 * 
	 * 
	 * 1] Chaining: 
	 *     Linked List (or a Dynamic Sized Array) is used to implement this technique. So what happens is, when multiple elements are hashed into the same slot index, 
	 *     then these elements are inserted into a singly-linked list which is known as a chain. 
	 */
}
