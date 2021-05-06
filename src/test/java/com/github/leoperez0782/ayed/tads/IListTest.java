package com.github.leoperez0782.ayed.tads;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.github.leoperez0782.ayed.tads.list.IList;
import com.github.leoperez0782.ayed.tads.list.ListImplementation;


class IListTest {
	
	private final int SECOND_ELEMENT = 1;
	private final int LAST_ELEMENT_INDEX_AFTER_REMOVE = 2;
	private final int SECOND_ELEMENT_VALUE = 10;
	private final int LAST_ELEMENT_VALUE = 20;
	private final int REMOVE_15 = 15;
	private final int NON_EXISTING_ELEMENT = 200;
	private final int EXPECTED_3 = 3;
	private final int EXPECTED_SIZE = 4;
	private final int INDEX_OUT_OF_BOUND = 10;
	IList<Integer> testList = new ListImplementation<>();
	
	@BeforeEach
	public void steup() {
		testList.clear();
		testList.add(1);
		testList.add(10);
		testList.add(15);
		testList.add(20);
	}
	@Test
	void shouldReturn4fromSetupSize() {
		assertEquals(EXPECTED_SIZE, testList.size());
		
	}

	@Test
	void shouldReturnTheSecondElement() {
		assertEquals(SECOND_ELEMENT_VALUE, testList.get(SECOND_ELEMENT));
		
	}
	
	@Test
	void shouldReturnSizeOf3AfterRemove() {
		testList.remove(REMOVE_15);
		assertEquals(EXPECTED_3, testList.size());
		assertEquals(LAST_ELEMENT_VALUE, testList.get(LAST_ELEMENT_INDEX_AFTER_REMOVE));
		
	}
	
	@Test
	void shouldReturnSizeOf4AfterRemoveNonExistentElement() {
		
		assertFalse(testList.remove(NON_EXISTING_ELEMENT));
		assertEquals(EXPECTED_SIZE, testList.size());
		
	}
	@Test
	void shouldReturnNullWhenOutOfBound() {
		
		assertNull(testList.get(INDEX_OUT_OF_BOUND));
		
	}
	@Test
	void shouldRemoveLast() {
		
		testList.remove(20);
		assertEquals(EXPECTED_3, testList.size());
		
	}
}
