public enum NameState {
    // wrong
    SWrong{
        @Override
        public NameState nextState(char a){
            return this;
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    // default
    S0{
        @Override
        public NameState nextState(char a){
            if(a=='a'){
                return S1;
            }else if(a=='b'){
                return S5;
            }else if(a=='c') {
                return S10;
            }else if(a=='d') {
                return S26;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    // auto
    S1{
        @Override
        public NameState nextState(char a){
            if(a=='u'){
                return S2;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S2{
        @Override
        public NameState nextState(char a){
            if(a=='t'){
                return S3;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S3{
        @Override
        public NameState nextState(char a){
            if(a=='o'){
                return S4;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S4{
        @Override
        public NameState nextState(char a){
            return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // break
    S5{
        @Override
        public NameState nextState(char a){
            if(a=='r'){
                return S6;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S6{
        @Override
        public NameState nextState(char a){
            if(a=='e'){
                return S7;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S7{
        @Override
        public NameState nextState(char a){
            if(a=='a'){
                return S8;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S8{
        @Override
        public NameState nextState(char a){
            if(a=='k'){
                return S9;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S9{
        @Override
        public NameState nextState(char a){
            return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // case
    S10{
        @Override
        public NameState nextState(char a){
            if(a=='a'){
                return S11;
            }else if(a=='h'){
                return S14;
            }else if(a=='o'){
                return S17;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S11{
        @Override
        public NameState nextState(char a){
            if(a=='s'){
                return S12;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S12{
        @Override
        public NameState nextState(char a){
            if(a=='e'){
                return S13;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S13{
        @Override
        public NameState nextState(char a){
            return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // char
    S14{
        @Override
        public NameState nextState(char a){
            if(a=='a'){
                return S15;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S15{
        @Override
        public NameState nextState(char a){
            if(a=='r'){
                return S16;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S16{
        @Override
        public NameState nextState(char a){
            return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // continue
    S17{
        @Override
        public NameState nextState(char a){
            if(a=='n'){
                return S18;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S18{
        @Override
        public NameState nextState(char a){
            if(a=='t'){
                return S19;
            }else if(a=='s'){
                return S24;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S19{
        @Override
        public NameState nextState(char a){
            if(a=='i'){
                return S20;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S20{
        @Override
        public NameState nextState(char a){
            if(a=='n'){
                return S21;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S21{
        @Override
        public NameState nextState(char a){
            if(a=='u'){
                return S22;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S22{
        @Override
        public NameState nextState(char a){
            if(a=='e'){
                return S23;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S23{
        @Override
        public NameState nextState(char a){
            return SWrong;

        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // const
    S24{
        @Override
        public NameState nextState(char a){
            if(a=='t'){
                return S25;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S25{
        @Override
        public NameState nextState(char a){
            return SWrong;

        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // do
    S26{
        @Override
        public NameState nextState(char a){
            if(a=='o'){
                return S27;
            }else if(a=='e'){
                return S28;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S27{
        @Override
        public NameState nextState(char a){
            if(a=='u'){
                return S27;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // default
    S28{
        @Override
        public NameState nextState(char a){
            if(a=='f'){
                return S29;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S29{
        @Override
        public NameState nextState(char a){
            if(a=='a'){
                return S30;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S30{
        @Override
        public NameState nextState(char a){
            if(a=='u'){
                return S31;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S31{
        @Override
        public NameState nextState(char a){
            if(a=='l'){
                return S32;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S32{
        @Override
        public NameState nextState(char a){
            if(a=='t'){
                return S33;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S33{
        @Override
        public NameState nextState(char a){
            return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    };

    public abstract NameState nextState(char a);
    public abstract boolean isOver();
}
