/**
*******************************************************************************
* Copyright (C) 1996-2005, International Business Machines Corporation and    *
* others. All Rights Reserved.                                                *
*******************************************************************************
*
*******************************************************************************
*/

package com.ibm.icu4jni.test.text;

import java.util.Locale;
import com.ibm.icu4jni.text.Collator;
import com.ibm.icu4jni.text.CollationAttribute;
import com.ibm.icu4jni.test.TestFmwk;

/**
* Testing class for german collator
* Mostly following the test cases for ICU
* @author Syn Wee Quek
* @since jan 25 2001
*/
public final class GermanCollatorTest extends TestFmwk
{ 
  
  // constructor ===================================================
  
  /**
  * Constructor
  */
  public GermanCollatorTest() throws Exception
  {
    m_collator_ = Collator.getInstance(Locale.GERMAN);
  }
  
  // public methods ================================================

  /**
  * Test with primary collation strength
  */
  public void TestPrimary() throws Exception
  {
    m_collator_.setStrength(CollationAttribute.VALUE_PRIMARY);
    for (int i = 0; i < SOURCE_TEST_CASE_.length ; i++) {
      CollatorTest.doTest(this, m_collator_, SOURCE_TEST_CASE_[i], 
                          TARGET_TEST_CASE_[i], EXPECTED_TEST_RESULT_[i][0]);
    }
  }
  
  /**
  * Test with tertiary collation strength
  */
  public void TestTertiary() throws Exception
  { 
    m_collator_.setStrength(CollationAttribute.VALUE_TERTIARY);
    for (int i = 0; i < 12 ; i++) {
      CollatorTest.doTest(this, m_collator_, SOURCE_TEST_CASE_[i], 
                          TARGET_TEST_CASE_[i], EXPECTED_TEST_RESULT_[i][1]);
    }
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
    "\u0047\u0072\u00F6\u00DF\u0065",
    "\u0061\u0062\u0063",
    "\u0054\u00F6\u006e\u0065",
    "\u0054\u00F6\u006e\u0065",
    "\u0054\u00F6\u006e\u0065",
    "\u0061\u0308\u0062\u0063",
    "\u00E4\u0062\u0063",
    "\u00E4\u0062\u0063",
    "\u0053\u0074\u0072\u0061\u00DF\u0065",
    "\u0065\u0066\u0067",
    "\u00E4\u0062\u0063",
    "\u0053\u0074\u0072\u0061\u00DF\u0065"
  };

  /**
  * Target strings for testing
  */
  private final String TARGET_TEST_CASE_[] = 
  {
    "\u0047\u0072\u006f\u0073\u0073\u0069\u0073\u0074",
    "\u0061\u0308\u0062\u0063",
    "\u0054\u006f\u006e",
    "\u0054\u006f\u0064",
    "\u0054\u006f\u0066\u0075",
    "\u0041\u0308\u0062\u0063",
    "\u0061\u0308\u0062\u0063",
    "\u0061\u0065\u0062\u0063",
    "\u0053\u0074\u0072\u0061\u0073\u0073\u0065",
    "\u0065\u0066\u0067",
    "\u0061\u0065\u0062\u0063",
    "\u0053\u0074\u0072\u0061\u0073\u0073\u0065"
  };

  /**
  * Comparison result corresponding to above source and target cases
  */
  private final int EXPECTED_TEST_RESULT_[][] = 
  {
    {Collator.RESULT_LESS, Collator.RESULT_LESS},
    {Collator.RESULT_EQUAL, Collator.RESULT_LESS},
    {Collator.RESULT_GREATER, Collator.RESULT_GREATER},
    {Collator.RESULT_GREATER, Collator.RESULT_GREATER},
    {Collator.RESULT_GREATER, Collator.RESULT_GREATER},
    {Collator.RESULT_EQUAL, Collator.RESULT_LESS},
    {Collator.RESULT_EQUAL, Collator.RESULT_EQUAL},
    {Collator.RESULT_LESS, Collator.RESULT_LESS},
    {Collator.RESULT_EQUAL, Collator.RESULT_GREATER},
    {Collator.RESULT_EQUAL, Collator.RESULT_EQUAL},
    {Collator.RESULT_LESS, Collator.RESULT_LESS},
    {Collator.RESULT_EQUAL, Collator.RESULT_GREATER}
  };
}

