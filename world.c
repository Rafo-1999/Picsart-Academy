#include <stdbool.h>

int now = 0;

struct Sun{
    int day;
    int night;
};

void Sun(struct Sun* s){
    s->day = 12;
    s->night = 0;
}

int GetDay(struct Sun* s){
    return s->day;
}

int GetNight(struct Sun* s){
    return s->night;
}

bool bright(struct Sun* s){
    if(now > GetDay(s)){
        return false;
    }
    return 1;
}

struct Tree{

};

bool oxygen(struct Tree* t,struct Sun* s){
    if(bright(s)){
        return 1;
    }
    return false;
}

struct Grass{};

struct Frog{
    int _age;
};

void Frog(struct Frog* f){
    f->_age = 0;
}

int GetAge(struct Frog* f){
    return f->_age;
}

bool Lives(struct Frog* f){
	if(GetAge(f) <= 5){
		return 1;
	}
	return false;
}

bool Eats(struct Frog* f,struct Grass* g){
	if(Lives(f)){
		return 1;
	}
	else return false;
}

bool Moves(struct Frog* f){
	if(Lives(f)){
		return 1;
	}
	return false;
};

bool Breath(struct Frog* f,struct Tree* t,struct Sun* s){
	if(oxygen(t,s) && Lives(f)){
		return 1;
	}
	return false;
}

bool Sleeps(struct Frog* f,struct Sun* s){ 
    if(bright(s)){
		return 0;
	}
	return 1;
}

struct MiniWorld{
	struct Frog* frogs;
	struct Grass* grass;
	struct Tree* tree;
	struct Sun* sun;
};
