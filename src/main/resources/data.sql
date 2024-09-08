-- Insert data into app_user table
INSERT INTO app_user (email, name, password)
VALUES
('admin@example.com', 'Admin User', 'admin123'),
('rider1@example.com', 'Rider One', 'rider123'),
('rider2@example.com', 'Rider Two', 'rider123'),
('rider3@example.com', 'Rider Three', 'rider123'),
('driver1@example.com', 'Driver One', 'driver123'),
('driver2@example.com', 'Driver Two', 'driver123');

-- Insert roles into user_roles table
INSERT INTO user_roles (user_id, roles)
VALUES
((SELECT id FROM app_user WHERE email = 'admin@example.com'), 'ADMIN'),
((SELECT id FROM app_user WHERE email = 'admin@example.com'), 'RIDER'),
((SELECT id FROM app_user WHERE email = 'rider1@example.com'), 'RIDER'),
((SELECT id FROM app_user WHERE email = 'rider2@example.com'), 'RIDER'),
((SELECT id FROM app_user WHERE email = 'rider3@example.com'), 'RIDER'),
((SELECT id FROM app_user WHERE email = 'driver1@example.com'), 'DRIVER'),
((SELECT id FROM app_user WHERE email = 'driver1@example.com'), 'RIDER'),
((SELECT id FROM app_user WHERE email = 'driver2@example.com'), 'DRIVER'),
((SELECT id FROM app_user WHERE email = 'driver2@example.com'), 'RIDER');

-- Insert into rider table with dummy ratings
INSERT INTO rider (rating, user_id)
VALUES
(4.5, (SELECT id FROM app_user WHERE email = 'rider1@example.com')),
(4.0, (SELECT id FROM app_user WHERE email = 'rider2@example.com')),
(3.8, (SELECT id FROM app_user WHERE email = 'rider3@example.com')),
(4.9, (SELECT id FROM app_user WHERE email = 'admin@example.com')), -- Admin is also a rider
(4.2, (SELECT id FROM app_user WHERE email = 'driver1@example.com')),
(4.7, (SELECT id FROM app_user WHERE email = 'driver2@example.com'));

-- Insert into driver table with correct geometry format for location
INSERT INTO driver (available, rating, user_id, vehicleid, current_location)
VALUES
(TRUE, 4.6, (SELECT id FROM app_user WHERE email = 'driver1@example.com'), 'XYZ1234', ST_GeomFromText('POINT(-75.96829712390901 42.08979538655368)', 4326)), -- New York
(TRUE, 4.8, (SELECT id FROM app_user WHERE email = 'driver2@example.com'), 'ABC9876', ST_GeomFromText('POINT(-118.243683 34.052235)', 4326)); -- Los Angeles

