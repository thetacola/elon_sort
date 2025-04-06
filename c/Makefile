linux: bin/elon_sort_test linux_libs
linux_libs: bin/libelonsort.so bin/libelonsort.a

# TODO: make windows version compile

#win: 
#win_libs: 

#bin/elon_sort.dll: src/elon_sort.c lib/elon_sort.h
#	gcc -c -Delonsort src/elon_sort.c

#bin/elon_sort_test.exe: src/elon_sort.c lib/elon_sort.h
#	mkdir -p bin
#	x86_64-w64-mingw32-gcc src/elon_sort.c -o bin/elon_sort_test.exe

bin/elon_sort_test: src/elon_sort.c lib/elon_sort.h
	mkdir -p bin
	gcc src/elon_sort.c -o bin/elon_sort_test

bin/libelonsort.so: src/elon_sort.c lib/elon_sort.h
	mkdir -p bin
	gcc -shared -o bin/libelonsort.so src/elon_sort.c -Iinclude/

bin/libelonsort.a: obj/elon_sort.o
	mkdir -p bin
	ar rcs bin/libelonsort.a obj/elon_sort.o

obj/elon_sort.o: src/elon_sort.c lib/elon_sort.h 
	mkdir -p obj
	gcc -c src/elon_sort.c -o obj/elon_sort.o

clean:
	rm -rf obj
	rm -rf bin
