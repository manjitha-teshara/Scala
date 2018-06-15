def trangle(){
	for(i<-1 to 5){
		for(j<-1 to 5-i){//1,2,3
			print(" ")
		}
		
		for(q<-1 to i){
			print("* ")
		}
		println()
	}
	
	for(i<-1 to 4){
		for(j<-1 to i){
			print(" ")
		}		//1,2,3,4
		for(j<-1 to 5-i){
			print("* ")
		}		
	println()	
	}
}