# VEC
open-source code to facilitate third-party development

## Vector Math Utilities – `vec2` and `vec3`

This repository provides two lightweight and self-contained classes, `vec2` and `vec3`, designed to simplify mathematical operations involving 2D and 3D vectors in Java.  
Both classes are written with clarity and extensibility in mind, offering **open code to facilitate third-party development**, reuse, and customization.

---

## ✨ Features Overview

### ✔ `vec2` – 2D Vector Class
The `vec2` utility provides intuitive and flexible tools for 2D vector manipulation, making it suitable for game development, simulations, geometry, graphics programming, and general math tasks.

#### Key Features
- Public `x` and `y` float components  
- Multiple constructors (`scalar`, `pair`, cloning)
- Arithmetic operations:
  - `add`, `sub`, `multi`, `div` (scalars, floats, or other `vec2`)
- Vector math:
  - `length()`, `normalize()`, `dot(...)`, `distance(...)`
  - `lerp(...)` for linear interpolation  
  - `rot(degrees)` for 2D rotation  
- Utility methods:
  - `Clone()`, `equals(...)`, `toString()`
- Clamping helpers:
  - Clamp by scalar, pair of scalars, or vector ranges

---

### ✔ `vec3` – 3D Vector Class
The `vec3` class extends vector functionality into 3D, providing a broad set of overloaded operators that interact naturally with `vec2` and scalar values.

#### Key Features
- Public `x`, `y`, and `z` float components  
- Multiple constructors:
  - Using floats, copying a `vec3`, building from `vec2 + float`, and more
- Arithmetic operations:
  - Component-wise `add`, `sub`, `multi`, `div`, with full overload support  
- Vector operations:
  - `length()` and `normalize()`  
  - Dot product overloads with (`vec3`), (`float,float,float`), (`float,vec2`), (`vec2,float`)
  - Distance functions with all combinations (`vec3`, `vec2+z`, `x+vec2`, etc.)
  - Linear interpolation `lerp(...)` with full overloads
- Rotation utilities:
  - `rotateX(deg)`, `rotateY(deg)`, `rotateZ(deg)`
- Cross product:
  - `cross(vec3)`
  - Overloads for floats + vec2 combinations
- Utility:
  - `Clone()`, `equals(...)`, `toString()`

---

## 🧩 Purpose and Philosophy

These classes are intentionally built to be:

- **Minimalistic** – no dependencies other than Java’s `Math` library  
- **Readable** – clean structure for beginners and professionals  
- **Extensible** – easy to integrate into larger engines or frameworks  
- **Open-source** – provided as **open code to facilitate third-party development**, allowing developers to adapt, rewrite, or expand the functionalities as needed.

You are free to:

- Use `vec2` and `vec3` in personal or commercial projects  
- Extend them with new math operations (matrix transforms, projections, quaternions, etc.)  
- Convert them to other languages (GML, C#, C++, GLSL, etc.)  
- Improve internal optimizations or tailor the API to your engine style

---

## 🤝 Contributions

Contributions, improvements, and suggestions are welcome.  
If you want to add new utilities such as:

- projection methods  
- angle-between vectors  
- vector smoothing  
- quaternion-based rotations  
- performance-optimized math  

…feel free to fork the repository and build on top of it.

---

## 📜 License
Open and free to use. Attribution is appreciated but not required.

