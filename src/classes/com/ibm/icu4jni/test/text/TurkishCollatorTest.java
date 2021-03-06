/**
*******************************************************************************
* Copyright (C) 1996-2005, International Business Machines Corporation and    *
* others. All Rights Reserved.                                                *
*******************************************************************************
*
*
*******************************************************************************
*/

package com.ibm.icu4jni.test.text;

import java.util.Locale;
import com.ibm.icu4jni.text.Collator;
import com.ibm.icu4jni.text.CollationAttribute;
import com.ibm.icu4jni.test.TestFmwk;

/**
* Testing class for Turkish collator
* Mostly following the test cases for ICU
* @author Syn Wee Quek
* @since jan 23 2001
*/
public final class TurkishCollatorTest extends TestFmwk
{ 
  
  // constructor ===================================================
  
  /**
  * Constructor
  */
  public TurkishCollatorTest() throws Exception
  {
    m_collator_ = Collator.getInstance(new Locale("tr", ""));
  }
  
  // public methods ================================================

  /**
  * Test with primary collation strength
  */
  public void TestPrimary() throws Exception
  {
    m_collator_.setStrength(CollationAttribute.VALUE_PRIMARY);
    for (int i = 8; i < 11; i ++)
      CollatorTest.doTest(this, m_collator_, SOURCE_TEST_CASE_[i], 
                          TARGET_TEST_CASE_[i], EXPECTED_TEST_RESULT_[i]);
  }

  /**
  * Test with tertiary collation strength
  */
  public void TestTertiary() throws Exception
  {
    m_collator_.setStrength(CollationAttribute.VALUE_TERTIARY);
    for (int i = 0; i < 8 ; i ++)
      CollatorTest.doTest(this, m_collator_, SOURCE_TEST_CASE_[i], 
                          TARGET_TEST_CASE_[i], EXPECTED_TEST_RESULT_[i]);
  }
  
  // private variables =============================================
  
  /**
  * RuleBasedCollator for testing
  */
  private Collator m_collator_;
  
  /**
  * Source strings for testing
  */
  private static final String SOURCE_TEST_CASE_[] = 
  {
    "\u0073\u0327",
    "\u0076\u00E4\u0074",
    "\u006f\u006c\u0064",
    "\u00FC\u006f\u0069\u0064",
    "\u0068\u011E\u0061\u006c\u0074",
    "\u0073\u0074\u0072\u0065\u0073\u015E",
    "\u0076\u006f\u0131\u0064",
    "\u0069\u0064\u0065\u0061",
    "\u00FC\u006f\u0069\u0064",
    "\u0076\u006f\u0131\u0064",
    "\u0069\u0064\u0065\u0061"
  };

  /**
  * Target strings for testing
  */
  private final String TARGET_TEST_CASE_[] = 
  {
    "\u0075\u0308",
    "\u0076\u0062\u0074",
    "\u00D6\u0061\u0079",
    "\u0076\u006f\u0069\u0064",
    "\u0068\u0061\u006c\u0074",
    "\u015E\u0074\u0072\u0065\u015E\u0073",
    "\u0076\u006f\u0069\u0064",
    "\u0049\u0064\u0065\u0061",
    "\u0076\u006f\u0069\u0064",
    "\u0076\u006f\u0069\u0064",
    "\u0049\u0064\u0065\u0061"
  };

  /**
  * Comparison result corresponding to above source and target cases
  */
  private final int EXPECTED_TEST_RESULT_[] = 
  {
    Collator.RESULT_LESS,
    Collator.RESULT_LESS,
    Collator.RESULT_LESS,
    Collator.RESULT_LESS,
    Collator.RESULT_GREATER,
    Collator.RESULT_LESS,
    Collator.RESULT_LESS,
    Collator.RESULT_GREATER,
    Collator.RESULT_LESS,
    Collator.RESULT_LESS,
    Collator.RESULT_GREATER                                               
  };
}

