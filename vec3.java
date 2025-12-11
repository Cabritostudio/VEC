

public class vec3 {
    public float x,y,z;
    public vec3(vec2 vec,float z){
        this(vec.x,vec.y,z);
    }
    public vec3(float x,vec2 vec){
        this(x,vec.x,vec.y);
    }
    public vec3(vec3 vec){
        this(vec.x,vec.y,vec.z);
    }
    public vec3(float x,float y,float z){
        this.x = x;
        this.y = y;
        this.z = z;

    }

    @Override
    public String toString(){
        return "vec3(" + this.x + ", " + this.y + ", " + this.z + ")";
    }

    public vec3 Clone(){ return new vec3(this.x,this.y,this.z); }

    public vec3 add(vec3 vec){
        return new vec3(
            this.x+vec.x,
            this.y+vec.y,
            this.z+vec.z
        );
    }
    public vec3 add(float x,float y,float z){
        return new vec3(
            this.x+x,
            this.y+y,
            this.z+z
        );
    }
    public vec3 add(float x,vec2 vec){
        return new vec3(
            this.x+x,
            this.y+vec.x,
            this.z+vec.y
        );
    }
    public vec3 add(vec2 vec,float z){
        return new vec3(
            this.x+vec.x,
            this.y+vec.y,
            this.z+z
        );
    }

    public vec3 sub(vec3 vec){
        return new vec3(
            this.x-vec.x,
            this.y-vec.y,
            this.z-vec.z
        );
    }
    public vec3 sub(float x,float y,float z){
        return new vec3(
            this.x-x,
            this.y-y,
            this.z-z
        );
    }
    public vec3 sub(float x,vec2 vec){
        return new vec3(
            this.x-x,
            this.y-vec.x,
            this.z-vec.y
        );
    }
    public vec3 sub(vec2 vec,float z){
        return new vec3(
            this.x-vec.x,
            this.y-vec.y,
            this.z-z
        );
    }

    public vec3 multi(vec3 vec){
        return new vec3(
            this.x*vec.x,
            this.y*vec.y,
            this.z*vec.z
        );
    }
    public vec3 multi(float x,float y,float z){
        return new vec3(
            this.x*x,
            this.y*y,
            this.z*z
        );
    }
    public vec3 multi(float x,vec2 vec){
        return new vec3(
            this.x*x,
            this.y*vec.x,
            this.z*vec.y
        );
    }
    public vec3 multi(vec2 vec,float z){
        return new vec3(
            this.x*vec.x,
            this.y*vec.y,
            this.z*z
        );
    }

    public vec3 div(vec3 vec){
        if( vec.x==0 || vec.y==0 || vec.z==0 ){ return this.Clone(); }
        return new vec3(
            this.x/vec.x,
            this.y/vec.y,
            this.z/vec.z
        );
    }
    public vec3 div(float x,float y,float z){
        if( x==0 || y==0 || z==0 ){ return this.Clone(); }
        return new vec3(
            this.x/x,
            this.y/y,
            this.z/z
        );
    }
    public vec3 div(float x,vec2 vec){
        if( x==0 || vec.x==0 || vec.y==0 ){ return this.Clone(); }
        return new vec3(
            this.x/x,
            this.y/vec.x,
            this.z/vec.y
        );
    }
    public vec3 div(vec2 vec,float z){
        if( vec.x==0 || vec.y==0 || z==0 ){ return this.Clone(); }
        return new vec3(
            this.x/vec.x,
            this.y/vec.y,
            this.z/z
        );
    }

    public float length(){
        return (float)Math.sqrt(this.x*this.x+this.y*this.y+this.z*this.z);
    }

    public vec3 normalize(){
        float l = this.length();
        if( l==0 ){return this.Clone();}
        return new vec3(this.x/l,this.y/l,this.z/l);
    }

    public float dot(vec3 vec){
        return this.x*vec.x+this.y*vec.y+this.z*vec.z;
    }
    public float dot(float x,float y,float z){
        return this.x*x+this.y*y+this.z*z;
    }
    public float dot(float x, vec2 vec){
        return this.x*x+this.y*vec.x+this.z*vec.y;
    }
    public float dot(vec2 vec,float z){
        return this.x*vec.x+this.y*vec.y+this.z*z;
    }

    public float distance(vec3 vec){     
        return (float)Math.sqrt( (this.x-vec.x)*(this.x-vec.x) + (this.y-vec.y)*(this.y-vec.y) + (this.z-vec.z)*(this.z-vec.z) );
    }
    public float distance(float x,float y,float z){     
        return (float)Math.sqrt( (this.x-x)*(this.x-x) + (this.y-y)*(this.y-y) + (this.z-z)*(this.z-z) );
    }
    public float distance(float x,vec2 vec){     
        return (float)Math.sqrt( (this.x-x)*(this.x-x) + (this.y-vec.x)*(this.y-vec.x) + (this.z-vec.y)*(this.z-vec.y) );
    }
    public float distance(vec2 vec,float z){     
        return (float)Math.sqrt( (this.x-vec.x)*(this.x-vec.x) + (this.y-vec.y)*(this.y-vec.y) + (this.z-z)*(this.z-z) );
    }

    public vec3 lerp(vec3 vec,float t){
        return new vec3(
            this.x+(vec.x-this.x)*t,
            this.y+(vec.y-this.y)*t,
            this.z+(vec.z-this.z)*t
        );
    }
    public vec3 lerp(float x,float y, float z,float t){
        return new vec3(
            this.x+(x-this.x)*t,
            this.y+(y-this.y)*t,
            this.z+(z-this.z)*t
        );
    }
    public vec3 lerp(float x ,vec2 vec,float t){
        return new vec3(
            this.x+(x-this.x)*t,
            this.y+(vec.x-this.y)*t,
            this.z+(vec.y-this.z)*t
        );
    }
    public vec3 lerp(vec2 vec,float z,float t){
        return new vec3(
            this.x+(vec.x-this.x)*t,
            this.y+(vec.y-this.y)*t,
            this.z+(z-this.z)*t
        );
    }

    public vec3 rotateX(float degrees) {
        float rad = (float)Math.toRadians(degrees);
        float cos = (float)Math.cos(rad);
        float sin = (float)Math.sin(rad);

        return new vec3(this.x, this.y * cos - this.z * sin, this.y * sin + this.z * cos);
    }
    public vec3 rotateY(float degrees) {
        float rad = (float)Math.toRadians(degrees);
        float cos = (float)Math.cos(rad);
        float sin = (float)Math.sin(rad);

        return new vec3(this.x * cos + this.z * sin, this.y, -this.x * sin + this.z * cos);
    }
    public vec3 rotateZ(float degrees) {
        float rad = (float)Math.toRadians(degrees);
        float cos = (float)Math.cos(rad);
        float sin = (float)Math.sin(rad);

        return new vec3(this.x * cos - this.y * sin, this.x * sin + this.y * cos, this.z);
    }

    public boolean equals(vec3 vec){
        return this.x==vec.x && this.y==vec.y && this.z==vec.z;
    }
    public boolean equals(float x,float y,float z){
        return this.x==x && this.y==y && this.z==z;
    }
    public boolean equals(float x,vec2 vec){
        return this.x==x && this.y==vec.x && this.z==vec.y;
    }
    public boolean equals(vec2 vec,float z){
        return this.x==vec.x && this.y==vec.y && this.z==z;
    }

    public vec3 cross(vec3 vec){
        return new vec3(
            this.y * vec.z - this.z * vec.y,
            this.z * vec.x - this.x * vec.z,
            this.x * vec.y - this.y * vec.x
        );
    }
    public vec3 cross(float x,vec2 vec){
        return new vec3(
            this.y * vec.y - this.z * vec.x,
            this.z * x - this.x * vec.y,
            this.x * vec.x - this.y * x
        );
    }
    public vec3 cross(vec2 vec,float z){
        return new vec3(
            this.y * z - this.z * vec.y,
            this.z * vec.x - this.x * z,
            this.x * vec.y - this.y * vec.x
        );
    }
    public vec3 cross(float x,float y,float z){
        return new vec3(
            this.y * z - this.z * y,
            this.z * x - this.x * z,
            this.x * y - this.y * x
        );
    }


}
