obj-m += mod0.o

all:
	make -C /lib/modules/$(shell uname -r)/build M=$(PWD) modules

clean:
	make -C /lib/modules/$(shell uname -r)/build M=$(PWD) clean

test:
	sudo dmesg -C
	sudo insmod mod0.ko
	cat /proc/mod0
	sudo rmmod mod0
	sudo dmesg