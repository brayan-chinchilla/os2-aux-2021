#include <linux/proc_fs.h>
#include <linux/seq_file.h>
#include <linux/module.h>
#include <linux/init.h>
#include <linux/mm.h>


MODULE_LICENSE("GPL");
MODULE_AUTHOR("Brayan Chinchilla");
MODULE_DESCRIPTION("Basic module");
MODULE_VERSION("1.0");

static int writeFile(struct seq_file* archivo, void *v){

    seq_printf(archivo, "---------------------------------------------\n");
    seq_printf(archivo, "Sistemas Operativos 2\n");
    seq_printf(archivo, "Brayan Chinchilla\n");
    seq_printf(archivo, "mod0\n");
    seq_printf(archivo, "---------------------------------------------\n\n");

    return 0;
}

static int atOpen(struct inode* inode, struct file* file){
    return single_open(file, writeFile, NULL);
}

static struct file_operations ops = {
    .open = atOpen,
    .read = seq_read
};


static int load_module(void) {
    struct sysinfo inf;

    si_meminfo(&inf);
    printk(KERN_INFO "mod0: Hola\n");
    printk(KERN_INFO "mod0: Memoria total: %8lu MB\n", inf.totalram * 4/1024);

    proc_create("mod0", 0, NULL, &ops);
    return 0;
}

static void unload_module(void) {
    printk(KERN_INFO "mod0: Adios\n");

    remove_proc_entry("mod0", NULL);
}

module_init(load_module);
module_exit(unload_module);