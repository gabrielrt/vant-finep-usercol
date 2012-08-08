DESCRIPTION = "hello world sample program"

PR = "r0"
SRC_URI = "file://hello.c"

S = "${WORKDIR}"

do_compile () {
 ${CC} ${CFLAGS} ${LDFLAGS} -o hello hello.c
 echo ${GFORTRAN} ${FORTRAN} ${FORTRANC} > /tmp/1234
}

do_install () {
 install -d ${D}${bindir}/
 install -m 0755 ${S}/hello ${D}${bindir}/
}

FILES_${PN} = "${bindir}/hello"
