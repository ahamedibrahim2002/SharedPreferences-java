# SharedPreferences-java
Here I have used SharedPreferences for implememting light/dark theme in my android application using java

funtion used:

SharedPreferences pref=getPreferences(MODE_PRIVATE);  //it us only used when you want only one preference to save

//for multiple Preferences 
SharedPreferences pref=getSharedPreferences("mypref",MODE_PRIVATE);  //it us only used when you want only one preference to save
