/* Generated By:JavaCC: Do not edit this line. JavaParserTokenManager.java */
import java.io.*;

/** Token Manager. */
public class JavaParserTokenManager implements JavaParserConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x80020000L) != 0L)
         {
            jjmatchedKind = 35;
            return 5;
         }
         if ((active0 & 0x57fede800L) != 0L)
         {
            jjmatchedKind = 35;
            return 43;
         }
         if ((active0 & 0x4000000000L) != 0L)
            return 11;
         if ((active0 & 0x101000L) != 0L)
         {
            jjmatchedKind = 35;
            return 23;
         }
         return -1;
      case 1:
         if ((active0 & 0x5ffefe800L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 1;
            return 43;
         }
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 1;
            return 20;
         }
         if ((active0 & 0x1000L) != 0L)
            return 43;
         return -1;
      case 2:
         if ((active0 & 0x5bfff0000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 2;
            return 43;
         }
         if ((active0 & 0x4000e800L) != 0L)
            return 43;
         return -1;
      case 3:
         if ((active0 & 0x539f00000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 3;
            return 43;
         }
         if ((active0 & 0x860f0000L) != 0L)
            return 43;
         return -1;
      case 4:
         if ((active0 & 0x519600000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 4;
            return 43;
         }
         if ((active0 & 0x20900000L) != 0L)
            return 43;
         return -1;
      case 5:
         if ((active0 & 0x18000000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 5;
            return 43;
         }
         if ((active0 & 0x501600000L) != 0L)
            return 43;
         return -1;
      case 6:
         if ((active0 & 0x10000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 35;
               jjmatchedPos = 5;
            }
            return -1;
         }
         if ((active0 & 0x8000000L) != 0L)
            return 43;
         return -1;
      case 7:
         if ((active0 & 0x10000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 35;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x10000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 35;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 9:
         if ((active0 & 0x10000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 35;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 10:
         if ((active0 & 0x10000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 35;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 11:
         if ((active0 & 0x10000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 35;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 12:
         if ((active0 & 0x10000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 35;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 13:
         if ((active0 & 0x10000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 35;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 14:
         if ((active0 & 0x10000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 35;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 15:
         if ((active0 & 0x10000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 35;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 16:
         if ((active0 & 0x10000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 35;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 51);
      case 40:
         return jjStopAtPos(0, 42);
      case 41:
         return jjStopAtPos(0, 43);
      case 42:
         return jjStopAtPos(0, 39);
      case 43:
         return jjStopAtPos(0, 37);
      case 44:
         return jjStopAtPos(0, 49);
      case 45:
         return jjStartNfaWithStates_0(0, 38, 11);
      case 47:
         return jjStopAtPos(0, 40);
      case 59:
         return jjStopAtPos(0, 48);
      case 61:
         return jjStopAtPos(0, 41);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x410000000L);
      case 91:
         return jjStopAtPos(0, 46);
      case 93:
         return jjStopAtPos(0, 47);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x850000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x8082000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x101000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x40000800L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x604000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x80020000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 123:
         return jjStopAtPos(0, 44);
      case 125:
         return jjStopAtPos(0, 45);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x4050000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x140208000L);
      case 102:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(1, 12, 43);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0xa0020000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x880000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x102000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000800L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x400400000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x1004000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0xc00000L);
      case 98:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(2, 14, 43);
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 100:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 43);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0xa6000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x210000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x100c0000L);
      case 116:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(2, 11, 43);
         else if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(2, 15, 43);
         return jjMoveStringLiteralDfa3_0(active0, 0x108000000L);
      case 119:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(2, 30, 43);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(3, 25, 43);
         break;
      case 101:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(3, 18, 43);
         else if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(3, 19, 43);
         return jjMoveStringLiteralDfa4_0(active0, 0x8200000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000L);
      case 108:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 43);
         return jjMoveStringLiteralDfa4_0(active0, 0x21000000L);
      case 110:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 43);
         else if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(3, 26, 43);
         break;
      case 115:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(3, 31, 43);
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x10400000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x100100000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      case 101:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(4, 29, 43);
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x1400000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x408000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000L);
      case 115:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(4, 23, 43);
         break;
      case 116:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(4, 20, 43);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 99:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(5, 22, 43);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(5, 24, 43);
         break;
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      case 103:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(5, 34, 43);
         break;
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000L);
      case 110:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(5, 32, 43);
         break;
      case 116:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(5, 21, 43);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 46:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000L);
      case 115:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(6, 27, 43);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 117:
         return jjMoveStringLiteralDfa9_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 46:
         return jjMoveStringLiteralDfa11_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 112:
         return jjMoveStringLiteralDfa12_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
static private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa13_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
static private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa14_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
static private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa15_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
static private int jjMoveStringLiteralDfa15_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0);
      return 15;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa16_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjStartNfa_0(14, active0);
}
static private int jjMoveStringLiteralDfa16_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(14, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(15, active0);
      return 16;
   }
   switch(curChar)
   {
      case 108:
         return jjMoveStringLiteralDfa17_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjStartNfa_0(15, active0);
}
static private int jjMoveStringLiteralDfa17_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(15, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(16, active0);
      return 17;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(17, 28);
         break;
      default :
         break;
   }
   return jjStartNfa_0(16, active0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   //int[] nextStates; // not used
   int startsAt = 0;
   jjnewStateCnt = 43;
   int i = 1;
   jjstateSet[0] = startState;
   //int j; // not used
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 23:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     jjCheckNAddTwoStates(33, 34);
                  }
                  else if (curChar == 36)
                  {
                     if (kind > 35)
                        kind = 35;
                  }
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     jjCheckNAddTwoStates(33, 34);
                  }
                  else if (curChar == 36)
                  {
                     if (kind > 35)
                        kind = 35;
                  }
                  break;
               case 43:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     jjCheckNAddTwoStates(33, 34);
                  }
                  else if (curChar == 36)
                  {
                     if (kind > 35)
                        kind = 35;
                  }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                     jjCheckNAddStates(0, 6);
                  }
                  else if ((0xac0000000000L & l) != 0L)
                  {
                     if (kind > 50)
                        kind = 50;
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(7, 9);
                  else if (curChar == 46)
                     jjCheckNAdd(1);
                  if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     jjCheckNAddTwoStates(33, 34);
                  }
                  else if (curChar == 36)
                  {
                     if (kind > 35)
                        kind = 35;
                  }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 11:
                  if (curChar == 49 && kind > 8)
                     kind = 8;
                  break;
               case 12:
                  if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 34)
                     jjCheckNAddStates(7, 9);
                  break;
               case 14:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(7, 9);
                  break;
               case 16:
                  if ((0x8400002400L & l) != 0L)
                     jjCheckNAddStates(7, 9);
                  break;
               case 17:
                  if (curChar == 34 && kind > 9)
                     kind = 9;
                  break;
               case 18:
                  if (curChar == 10)
                     jjCheckNAddStates(7, 9);
                  break;
               case 19:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAddTwoStates(33, 34);
                  break;
               case 34:
                  if (curChar == 36 && kind > 35)
                     kind = 35;
                  break;
               case 35:
                  if ((0xac0000000000L & l) != 0L && kind > 50)
                     kind = 50;
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddStates(0, 6);
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(37);
                  break;
               case 38:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(38, 39);
                  break;
               case 39:
                  if (curChar != 46)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAddTwoStates(40, 2);
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAddTwoStates(40, 2);
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAddTwoStates(41, 2);
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(42, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 23:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     jjCheckNAddTwoStates(33, 34);
                  }
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 20:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     jjCheckNAddTwoStates(33, 34);
                  }
                  if (curChar == 116)
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAdd(21);
                  }
                  break;
               case 43:
               case 33:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAddTwoStates(33, 34);
                  break;
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     jjCheckNAddTwoStates(33, 34);
                  }
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 30;
                  else if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 23;
                  else if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 9;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     jjCheckNAddTwoStates(33, 34);
                  }
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 2:
                  if ((0x5000000050L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 3:
                  if (curChar == 101 && kind > 8)
                     kind = 8;
                  break;
               case 4:
                  if (curChar == 117)
                     jjCheckNAdd(3);
                  break;
               case 6:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 115)
                     jjCheckNAdd(3);
                  break;
               case 8:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 14:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(7, 9);
                  break;
               case 15:
                  if (curChar == 92)
                     jjAddStates(10, 11);
                  break;
               case 16:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(7, 9);
                  break;
               case 21:
                  if (curChar == 91)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 22:
                  if (curChar == 93 && kind > 33)
                     kind = 33;
                  break;
               case 24:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if (curChar != 110)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(21);
                  break;
               case 26:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAddTwoStates(33, 34);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 14:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(7, 9);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 43 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   37, 38, 39, 41, 2, 42, 2, 14, 15, 17, 16, 19, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, 
"\156\157\164", "\151\146", "\145\156\144", "\163\165\142", "\154\145\164", 
"\143\141\154\154", "\164\150\145\156", "\143\141\163\145", "\145\154\163\145", 
"\151\156\160\165\164", "\163\145\154\145\143\164", "\163\164\141\164\151\143", 
"\143\154\141\163\163", "\160\165\142\154\151\143", "\166\157\151\144", "\155\141\151\156", 
"\145\170\164\145\156\144\163", "\123\171\163\164\145\155\56\157\165\164\56\160\162\151\156\164\154\156", 
"\167\150\151\154\145", "\156\145\167", "\164\150\151\163", "\162\145\164\165\162\156", null, 
"\123\164\162\151\156\147", null, null, "\53", "\55", "\52", "\57", "\75", "\50", "\51", "\173", "\175", 
"\133", "\135", "\73", "\54", null, "\41", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0xfffeffffffb61L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[43];
static private final int[] jjstateSet = new int[86];
static protected char curChar;
/** Constructor. */
public JavaParserTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public JavaParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 43; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String tokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   tokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, tokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  //int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
