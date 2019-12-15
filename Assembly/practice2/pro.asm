section .data

	prompt		db	"Enter a number: "
	promptLen	equ	$ - prompt
	return		db	"You entered: "
	returnLen	equ	$ - return

section .bss

	num resb 5

section .text

	global _start
	
_start:
	
	mov	ecx,	prompt
	mov	edx,	promptLen
	mov	ebx,	1
	mov	eax,	4
	int	0x80

	mov	eax,	3
	mov	ebx,	2
	mov	ecx,	num
	mov	edx,	5
	int	0x80

	mov	ecx,	return
	mov	edx,	returnLen
	mov	ebx,	1
	mov	eax,	4
	int	0x80

	mov	ecx,	num
	mov	ebx,	1
	mov	eax,	4
	mov	edx,	5
	int	0x80

	mov	eax,	1
	mov	ebx,	0
	int	0x80
