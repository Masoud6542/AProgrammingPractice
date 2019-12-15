section .data
	msg db "Hello this is the fucking assemblylurking here", 10, 0
	msg2 db "this is not  the rest of the shit", 10, 0
section .text
	extern printf
	global main
main:
	push ebp
	mov ebp, esp
	
	push msg
	call printf
	push msg2
	call printf
	
	mov esp,ebp
	pop ebp
	ret
