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
            }else if(a=='e') {
                return S38;
            }else if(a=='f') {
                return S50;
            }else if(a=='g') {
                return S57;
            }else if(a=='i') {
                return S61;
            }else if(a=='l') {
                return S65;
            }else if(a=='r') {
                return S69;
            }else if(a=='s') {
                return S81;
            }else if(a=='t') {
                return S0;
            }else if(a=='u') {
                return S0;
            }else if(a=='v') {
                return S0;
            }else if(a=='w') {
                return S0;
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
                return S34;
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
    },
    // double
    S34{
        @Override
        public NameState nextState(char a){
            if(a=='b'){
                return S35;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S35{
        @Override
        public NameState nextState(char a){
            if(a=='l'){
                return S36;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S36{
        @Override
        public NameState nextState(char a){
            if(a=='e'){
                return S37;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S37{
        @Override
        public NameState nextState(char a){
                return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // else
    S38{
        @Override
        public NameState nextState(char a){
            if(a=='l'){
                return S39;
            }else if(a=='n'){
                return S42;
            }else if(a=='x'){
                return S45;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S39{
        @Override
        public NameState nextState(char a){
            if(a=='s'){
                return S40;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S40{
        @Override
        public NameState nextState(char a){
            if(a=='e'){
                return S41;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S41{
        @Override
        public NameState nextState(char a){
            return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // extern
    S42{
        @Override
        public NameState nextState(char a){
            if(a=='u'){
                return S43;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S43{
        @Override
        public NameState nextState(char a){
            if(a=='m'){
                return S44;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S44{
        @Override
        public NameState nextState(char a){
            return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // extern
    S45{
        @Override
        public NameState nextState(char a){
            if(a=='t'){
                return S46;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S46{
        @Override
        public NameState nextState(char a){
            if(a=='e'){
                return S47;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S47{
        @Override
        public NameState nextState(char a){
            if(a=='r'){
                return S48;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S48{
        @Override
        public NameState nextState(char a){
            if(a=='n'){
                return S49;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S49{
        @Override
        public NameState nextState(char a){
            return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // for
    S50{
        @Override
        public NameState nextState(char a){
            if(a=='o'){
                return S51;
            }else if(a=='l'){
                return S53;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S51{
        @Override
        public NameState nextState(char a){
            if(a=='r'){
                return S52;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S52{
        @Override
        public NameState nextState(char a){
            return SWrong;

        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    S53{
        @Override
        public NameState nextState(char a){
            if(a=='o'){
                return S54;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S54{
        @Override
        public NameState nextState(char a){
            if(a=='a'){
                return S55;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S55{
        @Override
        public NameState nextState(char a){
            if(a=='t'){
                return S56;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S56{
        @Override
        public NameState nextState(char a){
            return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // goto
    S57{
        @Override
        public NameState nextState(char a){
            if(a=='o'){
                return S58;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S58{
        @Override
        public NameState nextState(char a){
            if(a=='t'){
                return S59;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S59{
        @Override
        public NameState nextState(char a){
            if(a=='o'){
                return S60;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S60{
        @Override
        public NameState nextState(char a){
            return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // if
    S61{
        @Override
        public NameState nextState(char a){
            if(a=='f'){
                return S62;
            }else if(a=='n'){
                return S63;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S62{
        @Override
        public NameState nextState(char a){
            return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // int
    S63{
        @Override
        public NameState nextState(char a){
            if(a=='t'){
                return S64;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S64{
        @Override
        public NameState nextState(char a){
                return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // long
    S65{
        @Override
        public NameState nextState(char a){
            if(a=='o'){
                return S66;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S66{
        @Override
        public NameState nextState(char a){
            if(a=='n'){
                return S67;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S67{
        @Override
        public NameState nextState(char a){
            if(a=='g'){
                return S68;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S68{
        @Override
        public NameState nextState(char a){
                return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // register
    S69{
        @Override
        public NameState nextState(char a){
            if(a=='e'){
                return S70;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S70{
        @Override
        public NameState nextState(char a){
            if(a=='g'){
                return S71;
            }else if(a=='t'){
                return S77;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S71{
        @Override
        public NameState nextState(char a){
            if(a=='i'){
                return S72;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S72{
        @Override
        public NameState nextState(char a){
            if(a=='s'){
                return S73;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S73{
        @Override
        public NameState nextState(char a){
            if(a=='t'){
                return S74;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S74{
        @Override
        public NameState nextState(char a){
            if(a=='e'){
                return S75;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S75{
        @Override
        public NameState nextState(char a){
            if(a=='r'){
                return S76;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S76{
        @Override
        public NameState nextState(char a){
            return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // return
    S77{
        @Override
        public NameState nextState(char a){
            if(a=='u'){
                return S78;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S78{
        @Override
        public NameState nextState(char a){
            if(a=='r'){
                return S79;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S79{
        @Override
        public NameState nextState(char a){
            if(a=='n'){
                return S80;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S80{
        @Override
        public NameState nextState(char a){
                return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // signed
    S81{
        @Override
        public NameState nextState(char a){
            if(a=='i'){
                return S82;
            }else if(a=='t'){
                return S91;
            }else if(a=='h'){
                return S81;
            }else if(a=='w'){
                return S81;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S82{
        @Override
        public NameState nextState(char a){
            if(a=='g'){
                return S83;
            }else if(a=='z'){
                return S87;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S83{
        @Override
        public NameState nextState(char a){
            if(a=='n'){
                return S84;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver()
        {
            return false;

        }
    },
    S84{
        @Override
        public NameState nextState(char a){
            if(a=='e'){
                return S85;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){

            return false;
        }
    },
    S85{
        @Override
        public NameState nextState(char a){
            if(a=='d'){
                return S86;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){

            return false;
        }
    },
    S86{
        @Override
        public NameState nextState(char a){
            return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // sizeof
    S87{
        @Override
        public NameState nextState(char a){
            if(a=='e'){
                return S88;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver()
        {
            return false;

        }
    },
    S88{
        @Override
        public NameState nextState(char a){
            if(a=='o'){
                return S89;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver()
        {
            return false;

        }
    },
    S89{
        @Override
        public NameState nextState(char a){
            if(a=='f'){
                return S90;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver()
        {
            return false;

        }
    },
    S90{
        @Override
        public NameState nextState(char a){
                return SWrong;
        }
        @Override
        public boolean isOver()
        {
            return true;
        }
    },
    // static
    S91{
        @Override
        public NameState nextState(char a){
            if(a=='a'){
                return S92;
            }else if(a=='r'){
                return S96;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver()
        {
            return false;

        }
    },
    S92{
        @Override
        public NameState nextState(char a){
            if(a=='t'){
                return S93;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver()
        {
            return false;

        }
    },
    S93{
        @Override
        public NameState nextState(char a){
            if(a=='i'){
                return S94;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver()
        {
            return false;

        }
    },
    S94{
        @Override
        public NameState nextState(char a){
            if(a=='c'){
                return S95;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver()
        {
            return false;

        }
    },
    S95{
        @Override
        public NameState nextState(char a){
                return SWrong;
        }
        @Override
        public boolean isOver()
        {
            return true;

        }
    },
    // struct
    S96{
        @Override
        public NameState nextState(char a){
            if(a=='u'){
                return S97;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver()
        {
            return false;

        }
    },
    S97{
        @Override
        public NameState nextState(char a){
            if(a=='c'){
                return S98;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver()
        {
            return false;

        }
    },
    S98{
        @Override
        public NameState nextState(char a){
            if(a=='t'){
                return S99;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver()
        {
            return false;

        }
    },
    S99{
        @Override
        public NameState nextState(char a){
                return SWrong;
        }
        @Override
        public boolean isOver()
        {
            return true;
        }
    };


    public abstract NameState nextState(char a);
    public abstract boolean isOver();
}
