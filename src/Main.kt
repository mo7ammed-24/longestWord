fun main() {
    print(longestWord("Ready, steady, go!"))
}

fun longestWord(text: String): String {
    var index=-1
    var myList=mutableListOf<String>()
    for(i in 0 until text.length){
        if(text[i]>='A' && text[i]<='Z' || text[i]>='a' && text[i]<='z'){
            if(index==-1)
                index=i
            if(index!=-1 && i==text.length-1)
                myList.add(text.slice(index..i))  }
        else if(index!=-1){
            myList.add(text.slice(index until i))
            index=-1
        }
        else continue}
    if(myList.size==0)
        return text
    var maxWord=myList[0]
    myList.forEach{if(it.length>=maxWord.length)
        maxWord=it
    }
    return maxWord
}