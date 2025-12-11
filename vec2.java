public class vec2 {
    public float x;
    public float y;

    public vec2(float s){
        this(s,s);
    }
    public vec2(float x,float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){ 
        return "vec2(" + this.x + ", " + this.y + ")";
    }
    
    public vec2 add(float x,float y){
        return new vec2(this.x+x,this.y+y);
    }
    public vec2 add(float s){
        return new vec2(this.x+s,this.y+s);
    }
    public vec2 add(vec2 vec){
        return new vec2(this.x+vec.x,this.y+vec.y);
    }  
    
    public vec2 sub(float x,float y){
        return new vec2(this.x-x,this.y-y);
    }
    public vec2 sub(vec2 vec){
        return new vec2(this.x-vec.x,this.y-vec.y);
    }
    public vec2 sub(float s){
        return new vec2(this.x-s,this.y-s);
    }
    
    public vec2 multi(float x,float y){
        return new vec2(this.x*x,this.y*y);
    }
    public vec2 multi(vec2 vec){
        return new vec2(this.x*vec.x,this.y*vec.y);
    }
    public vec2 multi(float s){
        return new vec2(this.x*s,this.y*s);
    }
    
    public vec2 div(float x,float y){
        if( x==0. || y==-0. ){ return this.Clone(); }
        return new vec2(this.x/x,this.y/y);
    }
    public vec2 div(vec2 vec){
        if( vec.x==0. || vec.y==-0. ){ return this.Clone(); }
        return new vec2(this.x/vec.x,this.y/vec.y);
    }
    public vec2 div(float s){
        if( s == 0. ){ return this.Clone(); }
        return new vec2(this.x/s,this.y/s);
    }
    
    public vec2 Clone(){
        return new vec2(this.x,this.y);
    }
    
    public float length(){
        return (float)Math.sqrt( this.x*this.x+this.y*this.y );
    }
    
    public vec2 normalize(){
        float l = this.length();
        if( l==0. ){ return this.Clone(); }
        return new vec2(this.x/l,this.y/l);
    }
    
    public float dot(float x,float y){
        return this.x*x + this.y*y;
    }
    public float dot(vec2 vec){
        return this.x*vec.x + this.y*vec.y;
    }

    public float distance(vec2 vec){     
        return (float)Math.sqrt( (this.x-vec.x)*(this.x-vec.x) + (this.y-vec.y)*(this.y-vec.y) );
    }
    public float distance(float x,float y){     
        return (float)Math.sqrt( (this.x-x)*(this.x-x) + (this.y-y)*(this.y-y) );
    }

    public vec2 lerp(vec2 vec,float t){
        return new vec2(
            this.x+(vec.x-this.x)*t,
            this.y+(vec.y-this.y)*t
        );
    }
    public vec2 lerp(float x,float y,float t){
        return new vec2(
            this.x+(x-this.x)*t,
            this.y+(y-this.y)*t
        );
    }

    public vec2 rot( float degrees ){
        float rad = (float)Math.toRadians(degrees);
        float cos = (float)Math.cos(rad);
        float sin = (float)Math.sin(rad);

        return new vec2(
            this.x * cos - this.y * sin,
            this.x * sin + this.y * cos
        );

    }

    public vec2 clamp(vec2 length){
        return new vec2(
            (float)Math.min( length.x,(float)Math.max(this.x,length.y) ),
            (float)Math.min( length.x,(float)Math.max(this.y,length.y) )
        );

    }
    public vec2 clamp(float min, float max){
        return new vec2(
            (float)Math.min( min,(float)Math.max(this.x,max) ),
            (float)Math.min( min,(float)Math.max(this.y,max) )
        );

    }
    public vec2 clamp(vec2 min,vec2 max){
        return new vec2(
            (float)Math.min( min.x,(float)Math.max(this.x,max.y) ),
            (float)Math.min( min.y,(float)Math.max(this.y,max.y) )
        );

    }
    public vec2 clamp(float min1, float max1,float min2,float max2){
        return new vec2(
            (float)Math.min( min1,(float)Math.max(this.x,max1) ),
            (float)Math.min( min2,(float)Math.max(this.y,max2) )
        );

    }

    public boolean equals(float x, float y){
        return this.x == x && this.y == y;
    }
    public boolean equals(vec2 vec){
        return this.x == vec.x && this.y == vec.y;
    }

    public float angle(){
        return (float)Math.atan2(this.y, this.x);
    }
}
