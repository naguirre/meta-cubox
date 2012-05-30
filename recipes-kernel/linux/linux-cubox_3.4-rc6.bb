require linux.inc

DESCRIPTION = "Linux kernel for Cubox board"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "(cubox)"

# This is on the master branch
SRCREV = "d3f19809d95b5f07179b3862f52382302e668f63"

MACHINE_KERNEL_PR_append = "${SRCREV}"

SRC_URI += "git://github.com/rabeeh/linux.git;protocol=git;branch=master"

S = "${WORKDIR}/git"

KERNEL_DEFCONFIG = "cubox_defconfig"

do_configure_prepend() {
	install -m 0644 ${S}/arch/${ARCH}/configs/${KERNEL_DEFCONFIG} ${WORKDIR}/defconfig || die "No default configuration for ${MACHINE} / ${KERNEL_DEFCONFIG} available."
}


