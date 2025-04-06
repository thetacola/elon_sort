linux: bin/elon_sort_test linux_libs
linux_libs: lib/libelonsort.so lib/libelonsort.a

linux_install: lib/libelonsort.so lib/libelonsort.a include/elon_sort.h bin/elon_sort_test
	# usually, this would be have a version name at the end
	# however, this is elon sort and doesnt really have version numbers
	@echo Requiring sudo to install...
	sudo cp lib/libelonsort.so /usr/lib/libelonsort.so
	sudo cp lib/libelonsort.a /usr/lib/libelonsort.a
	sudo cp include/elon_sort.h /usr/include/elon_sort.h
	sudo cp bin/elon_sort_test /bin/elon_sort_test
		

# TODO: make windows version compile

#win: 
#win_libs: 

#bin/elon_sort.dll: src/elon_sort.c include/elon_sort.h
#	gcc -c -Delonsort src/elon_sort.c

#bin/elon_sort_test.exe: src/elon_sort.c include/elon_sort.h
#	mkdir -p bin
#	x86_64-w64-mingw32-gcc src/elon_sort.c -o bin/elon_sort_test.exe

bin/elon_sort_test: src/elon_sort.c include/elon_sort.h
	mkdir -p bin
	gcc src/elon_sort.c -o bin/elon_sort_test

lib/libelonsort.so: src/elon_sort.c include/elon_sort.h
	mkdir -p lib
	gcc -shared -o lib/libelonsort.so src/elon_sort.c -Iinclude/

lib/libelonsort.a: obj/elon_sort.o
	mkdir -p lib
	ar rcs lib/libelonsort.a obj/elon_sort.o

obj/elon_sort.o: src/elon_sort.c include/elon_sort.h 
	mkdir -p obj
	gcc -c src/elon_sort.c -o obj/elon_sort.o

clean:
	rm -rf obj
	rm -rf lib
	rm -rf bin
