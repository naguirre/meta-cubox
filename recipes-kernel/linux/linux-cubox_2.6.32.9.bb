require linux.inc

DESCRIPTION = "Linux kernel for 88AP510 processors"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "(cubox)"

# This is on the master branch
SRCREV = "c04795236fe2cb5024b0e6f278ec59346afd43b3"

MACHINE_KERNEL_PR_append = "${SRCREV}"

SRC_URI += "git://github.com/rabeeh/linux-2.6.32.9.git;protocol=git;branch=master \
           file://defconfig"


S = "${WORKDIR}/git"

# Perf in 2.6.32 has broken perl handling, so disable it
do_compile_perf() {
	:
}

do_install_perf() {
	:
}

