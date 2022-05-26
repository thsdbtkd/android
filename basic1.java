public void onbutton1Clicked(View v){
  Toast.makeText(this,"뭐뭐뭐 버튼이 눌렸습니다.",Toast,LENGTH_LONG).show();
  }
 }
 
 public void onbutton2Clicked(View v){
  Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
  startActivity(myIntent);
 }
 
 public void onbutton3Clicked(View v){
  Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
  startActivity(myIntent);
 }
 
