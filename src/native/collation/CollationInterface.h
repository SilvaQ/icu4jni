/**
*******************************************************************************
* Copyright (C) 1996-2005, International Business Machines Corporation and    *
* others. All Rights Reserved.                                                *
*******************************************************************************
*
*******************************************************************************
*/
/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class CollationInterface */

#ifndef _Included_com_ibm_icu4jni_text_NativeCollation
#define _Included_com_ibm_icu4jni_text_NativeCollation
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    closeCollator
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_com_ibm_icu4jni_text_NativeCollation_closeCollator
  (JNIEnv *, jclass, jlong);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    closeElements
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_com_ibm_icu4jni_text_NativeCollation_closeElements
  (JNIEnv *, jclass, jlong);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    compare
 * Signature: (JLjava/lang/String;Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_com_ibm_icu4jni_text_NativeCollation_compare
  (JNIEnv *, jclass, jlong, jstring, jstring);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    getAttribute
 * Signature: (JI)I
 */
JNIEXPORT jint JNICALL Java_com_ibm_icu4jni_text_NativeCollation_getAttribute
  (JNIEnv *, jclass, jlong, jint);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    getCollationElementIterator
 * Signature: (JLjava/lang/String;)J
 */
JNIEXPORT jlong JNICALL Java_com_ibm_icu4jni_text_NativeCollation_getCollationElementIterator
  (JNIEnv *, jclass, jlong, jstring);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    getMaxExpansion
 * Signature: (JI)I
 */
JNIEXPORT jint JNICALL Java_com_ibm_icu4jni_text_NativeCollation_getMaxExpansion
  (JNIEnv *, jclass, jlong, jint);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    getNormalization
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_ibm_icu4jni_text_NativeCollation_getNormalization
  (JNIEnv *, jclass, jlong);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    getOffset
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_ibm_icu4jni_text_NativeCollation_getOffset
  (JNIEnv *, jclass, jlong);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    getRules
 * Signature: (J)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_ibm_icu4jni_text_NativeCollation_getRules
  (JNIEnv *, jclass, jlong);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    getSortKey
 * Signature: (JLjava/lang/String;)[B
 */
JNIEXPORT jbyteArray JNICALL Java_com_ibm_icu4jni_text_NativeCollation_getSortKey
  (JNIEnv *, jclass, jlong, jstring);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    hashCode
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_ibm_icu4jni_text_NativeCollation_hashCode
  (JNIEnv *, jclass, jlong);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    next
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_ibm_icu4jni_text_NativeCollation_next
  (JNIEnv *, jclass, jlong);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    openCollator
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_com_ibm_icu4jni_text_NativeCollation_openCollator__
  (JNIEnv *, jclass);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    openCollator
 * Signature: (Ljava/lang/String;)J
 */
JNIEXPORT jlong JNICALL Java_com_ibm_icu4jni_text_NativeCollation_openCollator__Ljava_lang_String_2
  (JNIEnv *, jclass, jstring);


/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    openCollatorFromRules
 * Signature: (Ljava/lang/String;II)J
 */
JNIEXPORT jlong JNICALL Java_com_ibm_icu4jni_text_NativeCollation_openCollatorFromRules
  (JNIEnv *, jclass, jstring, jint, jint);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    previous
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_ibm_icu4jni_text_NativeCollation_previous
  (JNIEnv *, jclass, jlong);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    primaryOrder
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_ibm_icu4jni_text_NativeCollation_primaryOrder
  (JNIEnv *, jclass, jint);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    reset
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_com_ibm_icu4jni_text_NativeCollation_reset
  (JNIEnv *, jclass, jlong);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    safeClone
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_com_ibm_icu4jni_text_NativeCollation_safeClone
  (JNIEnv *, jclass, jlong);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    secondaryOrder
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_ibm_icu4jni_text_NativeCollation_secondaryOrder
  (JNIEnv *, jclass, jint);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    setAttribute
 * Signature: (JII)V
 */
JNIEXPORT void JNICALL Java_com_ibm_icu4jni_text_NativeCollation_setAttribute
  (JNIEnv *, jclass, jlong, jint, jint);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    setOffset
 * Signature: (JI)V
 */
JNIEXPORT void JNICALL Java_com_ibm_icu4jni_text_NativeCollation_setOffset
  (JNIEnv *, jclass, jlong, jint);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    setText
 * Signature: (JLjava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_ibm_icu4jni_text_NativeCollation_setText
  (JNIEnv *, jclass, jlong, jstring);

/*
 * Class:     com_ibm_icu4jni_text_NativeCollation
 * Method:    tertiaryOrder
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_ibm_icu4jni_text_NativeCollation_tertiaryOrder
  (JNIEnv *, jclass, jint);

#ifdef __cplusplus
}
#endif
#endif
