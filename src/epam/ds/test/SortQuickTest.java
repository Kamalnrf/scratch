package epam.ds.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import epam.ds.SortQuick;

public class SortQuickTest {

	private int [] sortedLists;

	@Test
	public void testQuickSort() {
	   int [] unSortedList={34, 380, 69, 220, 301, 291, 81, 38, 200, 86, 196, 160, 427, 64, 328, 256, 205, 1, 116, 339, 341, 65, 182, 101, 375, 204, 32, 66, 31, 47, 452, 224, 150, 102, 386, 167, 46, 193, 332, 383, 113, 3, 475, 495, 27, 479, 210, 166, 92, 48, 35, 241, 440, 445, 29, 107, 268, 60, 243, 246, 293, 494, 351, 136, 333, 414, 480, 264, 178, 271, 307, 198, 215, 110, 401, 323, 430, 449, 33, 413, 397, 185, 463, 25, 364, 310, 266, 280, 477, 433, 313, 299, 15, 170, 8, 350, 62, 421, 357, 362, 419, 5, 318, 483, 369, 471, 97, 425, 145, 423, 308, 117, 44, 245, 225, 286, 199, 298, 82, 2, 17, 123, 392, 231, 214, 37, 227, 334, 138, 103, 179, 300, 349, 21, 302, 192, 416, 43, 125, 455, 481, 257, 172, 294, 387, 352, 11, 232, 120, 212, 154, 207, 377, 93, 169, 230, 83, 435, 500, 85, 79, 211, 89, 489, 431, 464, 140, 385, 391, 131, 296, 237, 261, 53, 347, 314, 153, 284, 412, 424, 422, 132, 171, 73, 206, 99, 450, 208, 50, 217, 337, 361, 221, 393, 263, 84, 370, 476, 276, 90, 30, 223, 139, 399, 279, 405, 491, 235, 322, 454, 253, 340, 42, 485, 465, 394, 498, 355, 146, 201, 236, 428, 233, 143, 499, 96, 467, 144, 417, 186, 161, 289, 403, 487, 88, 115, 404, 303, 165, 407, 244, 329, 354, 469, 292, 61, 26, 49, 238, 183, 443, 109, 118, 249, 4, 20, 213, 457, 18, 429, 316, 36, 105, 191, 267, 149, 473, 306, 304, 408, 147, 67, 426, 156, 462, 448, 295, 420, 371, 317, 410, 157, 409, 195, 275, 108, 218, 52, 177, 459, 478, 461, 133, 239, 54, 363, 418, 175, 56, 127, 396, 269, 128, 468, 447, 95, 282, 274, 441, 254, 456, 112, 366, 173, 24, 124, 164, 372, 63, 41, 174, 432, 281, 209, 311, 129, 321, 137, 482, 190, 359, 80, 488, 142, 78, 442, 23, 68, 297, 493, 252, 187, 265, 248, 247, 148, 255, 290, 151, 58, 7, 335, 497, 77, 283, 356, 13, 222, 326, 484, 28, 411, 158, 496, 91, 135, 466, 346, 325, 344, 474, 87, 39, 330, 345, 309, 122, 72, 285, 10, 374, 202, 180, 437, 59, 242, 12, 324, 270, 168, 70, 74, 100, 342, 16, 188, 121, 360, 472, 51, 259, 365, 305, 348, 272, 197, 194, 19, 378, 470, 381, 189, 159, 141, 353, 94, 250, 277, 415, 226, 240, 71, 234, 130, 312, 458, 460, 327, 388, 6, 219, 315, 319, 181, 162, 439, 367, 444, 453, 98, 258, 163, 331, 288, 75, 373, 486, 229, 55, 111, 338, 184, 400, 446, 382, 119, 402, 203, 390, 40, 389, 260, 379, 134, 336, 228, 395, 436, 106, 434, 176, 251, 492, 376, 155, 384, 126, 76, 216, 398, 451, 320, 9, 278, 262, 438, 57, 287, 406, 343, 273, 14, 22, 358, 152, 104, 45, 490, 368, 114};
	   long startTime = System.currentTimeMillis();
	   SortQuick sort = new SortQuick(unSortedList);
	   long endTime = System.currentTimeMillis();
	   sortedLists = sort.getSortedList();
	   //assert the returned list is indeed sorted
	   System.out.println(sort.toString());
	   assertTrue(isSorted());
	   long elapsedTime = endTime - startTime;
	   System.out.println("Elapsed time"+elapsedTime);
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
