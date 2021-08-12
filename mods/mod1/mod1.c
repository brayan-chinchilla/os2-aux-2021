#include <linux/proc_fs.h>
#include <linux/seq_file.h>
#include <linux/module.h>
#include <linux/init.h>

#include<linux/sched/signal.h>

MODULE_LICENSE("GPL");
MODULE_AUTHOR("Brayan Chinchilla");
MODULE_DESCRIPTION("Basic module");
MODULE_VERSION("1.0");

static int writeFile(struct seq_file* archivo, void *v){
    seq_printf(archivo, "---------------------------------------------\n");
    seq_printf(archivo, "Sistemas Operativos 2\n");
    seq_printf(archivo, "Brayan Chinchilla\n");
    seq_printf(archivo, "mod1\n");
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

int proc_count(void)
{
  int i=0;
  struct task_struct *thechild;
  for_each_process(thechild){
    i++;
  }
  return i;
}

static int load_module(void) {
    printk(KERN_INFO "mod1: Hello there\n");
    printk(KERN_INFO "mod1: There are %d running processes.\n", proc_count());

    proc_create("mod1", 0, NULL, &ops);
    return 0;
}

static void unload_module(void) {
    printk(KERN_INFO "mod1: Goodbye\n");

    remove_proc_entry("mod1", NULL);
}

module_init(load_module);
module_exit(unload_module);