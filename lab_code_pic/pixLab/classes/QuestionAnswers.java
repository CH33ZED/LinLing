/*A1: Questions
1. How many bits does it take to represent the values from 0 to 255?
 : 8 bits
2. How many bytes does it take to represent a color in the RGB color model?
 : 1 byte
3. How many pixels are in a picture that is 640 pixels wide and 480 pixels high?
 : 307200

A2: Questions
1. How can you make pink?
   :[r=255,g=0,b=255]
2. How can you make yellow?
   :[r=255,g=255,b=0]
3. How can you make purple?
   :[r=204,g=8,b=204]
4. How can you make white?
   :[r=255,g=255,b=255]
5. How can you make dark gray?
   :[r=51,g=51,b=51]

A3: Questions
1. What is the row index for the top left corner of the picture?
 : 0
2. What is the column index for the top left corner of the picture?
 : 0
3. The width of this picture is 640. What is the right most column index?
 : 639
4. The height of this picture is 480. What is the bottom most row index?
 : 479
5. Does the row index increase from left to right or top to bottom?
 : Top to bottom
6. Does the column index increase from left to right or top to bottom?
 : Left to right
7. Set the zoom to 500%. Can you see squares of color? This is called pixelation. Pixelation means
displaying a picture so magnified that the individual pixels look like small squares.
: Yes.

A5: Questions
1. Open Picture.java and look for the method getPixels2D. Is it there?
   : Only called, not implemented.
2. Open SimplePicture.java and look for the method getPixels2D. Is it there?
  : Yes, implemented there
3. Does the following code compile?
 DigitalPicture p = new DigitalPicture();
  : No, DigitalPicture is an interface so it can't be instantiated
4. Assuming that a no-argument constructor exists for SimplePicture, would the following
code compile?
 DigitalPicture p = new SimplePicture();
  : Yes
5. Assuming that a no-argument constructor exists for Picture, does the following code
compile?
 DigitalPicture p = new Picture();
  : Yes
6. Assuming that a no-argument constructor exists for Picture, does the following code
compile?
 SimplePicture p = new Picture();
  : Yes
7. Assuming that a no-argument constructor exists for SimplePicture, does the following
code compile?
 Picture p = new SimplePicture();
  : No, Picture and SimplePictures are incompatible types

A7: Questions
1. How many times would the body of this nested for loop execute?
 for (int row = 7; row < 17; row++)
 for (int col = 6; col < 15; col++)
 :90
2. How many times would the body of this nested for loop execute?
 for (int row = 5; row <= 11; row++)
 for (int col = 3; col <= 18; col++)
 :112


 */
