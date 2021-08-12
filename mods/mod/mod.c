#include <linux/module.h>
#include <linux/init.h>

static int load_module(void) {
    printk(KERN_INFO "mod: Hola mundo\n");
    return 0;
}

static void unload_module(void) {
    printk(KERN_INFO "mod: Adios mundo!\n");
}

module_init(load_module);
module_exit(unload_module);