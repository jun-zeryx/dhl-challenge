-- --------------------------------------------------------
--
-- Table structure for table postcodelatlng
--

-- First connect to a specific database
\c dhl

CREATE TABLE postcodelatlng (
  id BIGINT PRIMARY KEY,
  created_at TIMESTAMP DEFAULT NOW(),
  updated_at TIMESTAMP NULL,
  postcode VARCHAR(8) NOT NULL,
  latitude DECIMAL(10,7) NULL,
  longitude DECIMAL(10,7) NULL
);
