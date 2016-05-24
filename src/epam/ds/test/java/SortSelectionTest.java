package epam.ds.test.java;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import epam.ds.SortSelection;

public class SortSelectionTest {

	private int [] sortedLists;

	@Test
	public void sortInsertion() {
	   int [] unSortedList={140, 291, 61, 329, 267, 493, 133, 213, 393, 142, 232, 124, 44, 290, 53, 424, 176, 249, 300, 433, 355, 266, 497, 427, 202, 42, 319, 477, 64, 450, 79, 29, 365, 222, 22, 244, 498, 159, 192, 465, 467, 97, 27, 231, 163, 419, 168, 405, 335, 110, 491, 500, 296, 374, 33, 490, 400, 87, 466, 233, 98, 457, 418, 307, 36, 188, 305, 239, 34, 37, 421, 200, 496, 415, 357, 117, 292, 24, 487, 16, 247, 460, 293, 416, 186, 385, 221, 128, 340, 184, 166, 84, 285, 376, 28, 361, 225, 111, 414, 197, 381, 426, 1, 3, 455, 47, 397, 429, 302, 102, 101, 219, 5, 51, 279, 216, 43, 288, 417, 317, 228, 14, 72, 85, 430, 56, 194, 65, 407, 375, 23, 323, 342, 48, 311, 464, 80, 273, 157, 345, 177, 223, 226, 449, 74, 185, 452, 121, 370, 471, 277, 190, 207, 143, 485, 274, 151, 287, 459, 147, 164, 91, 193, 324, 26, 422, 372, 377, 352, 152, 12, 9, 57, 31, 475, 367, 20, 131, 113, 425, 379, 326, 217, 394, 155, 434, 284, 210, 299, 371, 148, 297, 251, 410, 494, 203, 18, 21, 73, 171, 298, 470, 59, 104, 398, 295, 316, 474, 69, 358, 86, 115, 175, 66, 235, 256, 363, 63, 130, 195, 252, 139, 413, 183, 241, 447, 258, 105, 439, 271, 78, 178, 67, 146, 488, 399, 334, 170, 211, 179, 19, 359, 337, 301, 451, 308, 310, 82, 327, 443, 448, 189, 137, 10, 495, 409, 406, 368, 384, 141, 136, 126, 94, 70, 489, 158, 341, 333, 468, 112, 349, 49, 408, 62, 125, 149, 431, 378, 269, 281, 201, 275, 162, 224, 25, 15, 403, 436, 144, 250, 13, 220, 227, 282, 172, 240, 392, 461, 435, 129, 380, 420, 198, 382, 81, 356, 353, 132, 41, 369, 89, 255, 114, 458, 45, 60, 135, 76, 55, 441, 71, 99, 325, 294, 314, 350, 209, 303, 174, 469, 106, 50, 32, 391, 346, 482, 169, 120, 270, 39, 173, 386, 388, 11, 265, 103, 153, 77, 484, 54, 238, 109, 404, 156, 276, 339, 215, 68, 321, 318, 445, 309, 401, 411, 312, 472, 218, 196, 454, 116, 362, 480, 286, 7, 230, 432, 364, 83, 476, 438, 160, 322, 187, 154, 199, 8, 473, 395, 366, 234, 237, 118, 351, 444, 38, 343, 119, 268, 313, 347, 92, 442, 320, 150, 462, 248, 463, 88, 492, 453, 127, 456, 383, 264, 261, 229, 123, 272, 253, 90, 360, 6, 263, 328, 412, 46, 52, 446, 40, 344, 236, 479, 205, 165, 93, 336, 332, 280, 208, 440, 245, 402, 354, 289, 483, 478, 348, 212, 243, 437, 30, 100, 387, 35, 145, 214, 331, 75, 182, 206, 138, 315, 499, 204, 278, 486, 304, 96, 242, 423, 254, 262, 4, 481, 167, 260, 122, 330, 246, 95, 390, 396, 428, 373, 389, 306, 2, 283, 161, 181, 58, 259, 257, 180, 134, 108, 107, 17, 338, 191};
	   SortSelection sort= new SortSelection(unSortedList);
	   sortedLists = sort.getSortedList();
	   //assert the returned list is indeed sorted
	   assertTrue(isSorted());
	}
	
	public int[] getResult(){
		return null;
	}
	/**
	 * Test harness to check if the returned list is sorted
	 * @return Boolean true if the list is sorted
	 */
	public boolean isSorted(){
		int i=1;
		//i leads x 
		for(int j=0;j<sortedLists.length;j++){
			if(i<sortedLists.length&&sortedLists[j]>sortedLists[i]){
				return false;
			}
			i++;
		}
		return true;
	}

}