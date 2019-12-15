	.global _start

	.text

_start:

	mov	$1, %rax
	mov	$1, %rdi
	mov	$msg, %rsi
	mov	$46, %rdx
	syscall

	mov	$60, %rax
	xor	%rdi, %rdi
	syscall
msg:
	.ascii	"hello gas this is me gasing here for you too\n"
