/**************************************************************
 *
 * userprog/ksyscall.h
 * Kernel interface for systemcalls
 *
 * by Marcus Voelp  (c) Universitaet Karlsruhe
 *
 **************************************************************/

#ifndef __USERPROG_KSYSCALL_H__
#define __USERPROG_KSYSCALL_H__

#include "kernel.h"

#include "synchconsole.h"


void SysHalt()
{
    kernel->interrupt->Halt();
}

void SysPrintInt(int number)
{
    kernel->interrupt->PrintInt(number);
}

int SysAdd(int op1, int op2)
{
    return op1 + op2;
}

int SysCreate(char *filename)
{
	// return value
	// 1: success
	// 0: failed
	return kernel->interrupt->CreateFile(filename);
}

int SysOpen(char *name)
{
    return kernel->interrupt->Open(name);
}

/*
int SysWrite(int buffer_addr, int ch_size, int id)
{
    int i;
    int bytevalue;
    char buf[ch_size];
    for (i = 0; i < ch_size; ++i)
    {
        kernel->machine->ReadMem(buffer_addr + i, 1, &bytevalue);
        buf[i] = (char) bytevalue;
    }
    return kernel->interrupt->Write(buf, ch_size, id);
}*/

int SysWrite(char* buf, int ch_size, int id)
{
    return kernel->interrupt->Write(buf, ch_size, id);
}

int SysRead(char* buffer, int ch_size, int id)
{
    return kernel->interrupt->Read(buffer, ch_size, id);
}

int SysClose(int id)
{
    return kernel->interrupt->Close(id);
}

#endif /* ! __USERPROG_KSYSCALL_H__ */
