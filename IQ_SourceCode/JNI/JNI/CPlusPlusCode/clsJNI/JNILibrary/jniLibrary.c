#include "stdafx.h"
#include "clsJNI.h"

    
JNIEXPORT jint JNICALL Java_clsJNI_addTwoNumbers
  (JNIEnv *, jobject, jint one, jint two)
{
     return(one + two);
}
    

    
BOOL APIENTRY DllMain( HANDLE hModule, 
                       DWORD  ul_reason_for_call, 
                       LPVOID lpReserved
                     )
{
    return TRUE;
}
