require linux.inc

DESCRIPTION = "Linux kernel for Cubox board"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "(cubox)"

# This is on the master branch
SRCREV = "1be2c7686ab85ab11f92e90843cd8e0ea2cc93ac"

MACHINE_KERNEL_PR_append = "${SRCREV}"

SRC_URI += "git://github.com/rabeeh/linux.git;protocol=git;branch=master"

S = "${WORKDIR}/git"

KERNEL_DEFCONFIG = "cubox_defconfig"

do_configure_prepend() {
	install -m 0644 ${S}/arch/${ARCH}/configs/${KERNEL_DEFCONFIG} ${WORKDIR}/defconfig || die "No default configuration for ${MACHINE} / ${KERNEL_DEFCONFIG} available."
}


