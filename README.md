# 🛒 Dropify

A full-stack e-commerce application built with React and Spring Boot, offering a complete online shopping experience with user authentication, product management, cart functionality, and order processing.

## 📋 Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Backend Setup](#backend-setup)
  - [Frontend Setup](#frontend-setup)
- [API Endpoints](#api-endpoints)
- [Features in Detail](#features-in-detail)
- [Contributing](#contributing)
- [License](#license)

## ✨ Features

- **User Authentication & Authorization**
  - User registration and login with JWT token-based authentication
  - Secure password handling with Spring Security
  - Protected routes for authenticated users

- **Product Management**
  - Browse products by categories
  - Search products by name, category, or description
  - View detailed product information
  - Product pagination for better navigation

- **Shopping Cart**
  - Add/remove products to/from cart
  - View cart items
  - Update cart quantities
  - Cart persistence for logged-in users

- **Order Management**
  - Single product checkout
  - Multiple product checkout from cart
  - Order confirmation
  - View order history

- **Customer Support**
  - Contact form for customer queries
  - Image upload support for queries
  - Query submission confirmation

- **Special Features**
  - Discount deals section
  - Department-wise product categorization
  - User profile management
  - Responsive design with Bootstrap

## 🛠️ Tech Stack

### Frontend
- **React** 18.3.1 - UI library
- **React Router DOM** 6.24.0 - Client-side routing
- **Reactstrap** 9.2.2 - React Bootstrap components
- **Bootstrap** 5.3.3 - CSS framework
- **Axios** 1.7.2 - HTTP client
- **React Toastify** 10.0.5 - Toast notifications
- **Remix Icon** 4.3.0 - Icon library

### Backend
- **Spring Boot** 3.3.0 - Java framework
- **Spring Security** - Authentication and authorization
- **Spring Data JPA** - Data persistence
- **MySQL** - Database
- **JWT (jsonwebtoken)** 0.11.5 - Token-based authentication
- **Lombok** - Reduce boilerplate code
- **Maven** - Build tool

## 📁 Project Structure

```
Dropify/
├── Backend/
│   └── src/
│       ├── main/
│       │   └── java/
│       │       └── com/ecommerce/dropify/
│       │           ├── controller/      # REST Controllers
│       │           ├── dto/             # Data Transfer Objects
│       │           ├── model/           # Entity classes
│       │           ├── repository/      # JPA Repositories
│       │           ├── service/         # Business logic
│       │           ├── jwt/             # JWT authentication helper
│       │           └── DropifyApplication.java
│       └── pom.xml
│
└── Frontend/
    ├── public/
    ├── src/
    │   ├── components/      # Reusable components
    │   ├── pages/           # Page components
    │   ├── services/        # API service calls
    │   ├── auth/            # Authentication utilities
    │   ├── css/             # Stylesheets
    │   ├── App.js
    │   └── index.js
    └── package.json
```

## 🚀 Getting Started

### Prerequisites

- **Node.js** (v14 or higher)
- **npm** or **yarn**
- **Java JDK** 17 or higher
- **MySQL** database
- **Maven** 3.6+

### Backend Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/rishabhrawat05/Dropify.git
   cd Dropify/Backend
   ```

2. **Configure MySQL database**
   
   Create a MySQL database and update the `application.properties` file:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/dropify
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Build and run the backend**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

   The backend server will start on `http://localhost:8080`

### Frontend Setup

1. **Navigate to Frontend directory**
   ```bash
   cd ../Frontend
   ```

2. **Install dependencies**
   ```bash
   npm install
   ```

3. **Configure API endpoint**
   
   Update the API base URL in your service files to point to your backend server.

4. **Start the development server**
   ```bash
   npm start
   ```

   The application will open at `http://localhost:3000`

## 🔌 API Endpoints

### User Management
- `POST /api/user/register` - Register a new user
- `GET /api/user/{id}` - Get user by ID
- `GET /api/user/all` - Get all users
- `PUT /api/user/update` - Update user details
- `DELETE /api/user/delete/{id}` - Delete user

### Authentication
- `POST /auth/login` - User login

### Product Management
- `GET /api/products` - Get all products
- `GET /api/products/{id}` - Get product by ID
- `GET /api/products/category/{categoryName}` - Get products by category
- `GET /api/products/search?keyword={keyword}` - Search products
- `POST /api/products` - Create a new product
- `PUT /api/products/{id}` - Update product
- `DELETE /api/products/{id}` - Delete product
- `GET /api/getProductDetails/{isSingleProductCheckout}/{productId}` - Get product details for checkout

### Cart Management
- `GET /cart/add/{productId}` - Add product to cart
- `GET /cart/get/{id}` - Get cart by ID
- `GET /cart/get/user` - Get cart for current user
- `PUT /cart/update/{cartItemId}` - Update cart item
- `DELETE /cart/delete/{cartItemId}` - Remove cart item
- `DELETE /cart/delete/product/{productId}` - Remove product from cart

### Orders
- `POST /orders` - Create new order
- `GET /orders/user/{userId}` - Get user orders

### Customer Support
- `POST /support/query` - Submit customer query

## 🎯 Features in Detail

### Authentication Flow
- User registration with validation (username, email, password)
- JWT token generation on successful login
- Token stored in localStorage
- Protected routes using PrivateRoute component
- Token-based API authentication

### Shopping Experience
- **Home Page**: Featured products and categories
- **Departments**: Browse products by department
- **Product Dashboard**: Detailed product view with images and specifications
- **Search**: Find products by name, category, or description
- **Discount Deals**: Special offers and discounts

### Cart & Checkout
- Add products to cart (requires login)
- View and manage cart items
- Single product checkout or cart checkout
- Order confirmation page

### User Profile
- View and edit profile information
- View order history
- Manage cart items

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request


## 👤 Author

**Rishabh Rawat**
- GitHub: [@rishabhrawat05](https://github.com/rishabhrawat05)

## 🙏 Acknowledgments

- React documentation and community
- Spring Boot documentation
- Bootstrap team for the UI framework
- All contributors and supporters

---

⭐ If you found this project helpful, please give it a star!
