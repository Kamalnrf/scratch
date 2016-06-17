package epam.ds.test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import epam.ds.LinkedList;

import java.util.Random;

public class LinkedListTest {

	@Test
	public void testIntegerList()
    {
        int size = 100;
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addToList(1);
        list.addToList(2);
        list.addToList(3);
        assertEquals(3 , list.size());
        assertEquals("[1,2,3]" , list.toString());

        list = populateIntList(size);
        assertEquals(size, list.size());
        removeData(list, 50);
        removeData(list, 20);
	}
	
	@Test
	public void testCharacterList()
    {
        int size = 100;
		LinkedList<Character> charList = new LinkedList<Character>();
		charList.addToList('r');
		charList.addToList('o');
        charList.addToList('h');
        charList.addToList('i');
        charList.addToList('t');
	    assertEquals(5,charList.size());
	    assertEquals("[r,o,h,i,t]",charList.toString());

        charList = populateCharList(size);
        assertEquals(size, charList.size());
        removeData(charList, 50);
        checkFind(charList, 20);
	}

    public LinkedList populateIntList (int toGenerate)
    {
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int counter = 0; counter < toGenerate; counter++)
        {
            list.addToList(random.nextInt());
        }

        return list;
    }

    public LinkedList populateCharList (int toGenerate)
    {
        Random random = new Random();
        LinkedList<Character> list = new LinkedList<>();

        for (int counter = 0; counter < toGenerate; counter++)
        {
            list.addToList((char) random.nextInt());
        }

        return list;
    }

    public static void removeData (LinkedList list, int toRemove)
    {
        for (int counter = 1; counter < toRemove; counter++)
        {
            assertTrue(list.remove(counter));
        }
    }

    public static void checkFind (LinkedList list, int toCheck)
    {
        for (int counter = 0; counter < toCheck; counter++)
        {
            assertFalse(list.find(counter) != -1);
        }
    }

}
