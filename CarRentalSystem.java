import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Car {
    String name;
    double price;
    int rentalTime;

    public Car(String name, double price, int rentalTime) {
        this.name = name;
        this.price = price;
        this.rentalTime = rentalTime;
    }

    @Override
    public String toString() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Customer {
    String name;
    Car selectedCar;
    String paymentOption;
    String cardNumber;
    String mobileNumber;
    double amountPaid;
    int rentalHours;

    public Customer(String name, Car selectedCar, String paymentOption, String cardNumber, String mobileNumber, double amountPaid, int rentalHours) {
        this.name = name;
        this.selectedCar = selectedCar;
        this.paymentOption = paymentOption;
        this.cardNumber = cardNumber;
        this.mobileNumber = mobileNumber;
        this.amountPaid = amountPaid;
        this.rentalHours = rentalHours;
    }

    @Override
    public String toString() {
        String paymentDetails = paymentOption.equals("Debit Card") || paymentOption.equals("Credit Card") ?
                "\nCard Number: " + cardNumber :
                "";
        return "Customer: " + name +
                "\nSelected Car: " + selectedCar.name +
                "\nPrice: Rs." + selectedCar.getPrice() +
                "\nRental Time: " + rentalHours + " hours" +
                "\nPayment Option: " + paymentOption +
                paymentDetails +
                "\nMobile Number: " + mobileNumber +
                "\nAmount Paid: Rs." + amountPaid;
    }
}

class ImagePanel extends JPanel {
    private Image backgroundImage;

    public ImagePanel(String imagePath) {
        try {
            backgroundImage = new ImageIcon(imagePath).getImage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}

class CarRentalSysteme extends JFrame {
    private JComboBox<Car> carComboBox;
    private JTextField customerNameField;
    private JComboBox<String> paymentComboBox;
    private JTextField cardNumberField;
    private JTextField mobileNumberField;
    private JTextField rentalTimeField;
    private JTextField amountField;

    private ArrayList<Car> availableCars;
    private ArrayList<Customer> customers = new ArrayList<>();

    public CarRentalSysteme() {
        setTitle("Car Rental System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use the custom ImagePanel as the content pane
        ImagePanel imagePanel = new ImagePanel("path/to/your/car/image.jpg");
        setContentPane(imagePanel);
        initializeComponents();
        initializeCars();
    }

    private void initializeComponents() {
        // Set layout on the content pane
        getContentPane().setLayout(new GridLayout(9, 2));

        JLabel nameLabel = new JLabel("Customer Name:");
        customerNameField = new JTextField();

        JLabel carLabel = new JLabel("Select Car:");
        carComboBox = new JComboBox<>();

        JLabel paymentLabel = new JLabel("Payment Option:");
        paymentComboBox = new JComboBox<>(new String[]{"Credit Card", "Cash", "Debit Card"});

        JLabel cardNumberLabel = new JLabel("Card Number:");
        cardNumberField = new JTextField();
        cardNumberField.setEditable(false);
        paymentComboBox.addActionListener(e -> cardNumberField.setEditable(paymentComboBox.getSelectedItem().equals("Debit Card") || paymentComboBox.getSelectedItem().equals("Credit Card")));

        JLabel mobileNumberLabel = new JLabel("Mobile Number:");
        mobileNumberField = new JTextField();

        JLabel rentalTimeLabel = new JLabel("Rental Time (hours):");
        rentalTimeField = new JTextField();

        JLabel amountLabel = new JLabel("Amount Paid:");
        amountField = new JTextField();
        amountField.setEditable(false);

        JButton rentButton = new JButton("Rent Car");
        rentButton.addActionListener(e -> rentCar());

        JButton showDetailsButton = new JButton("Show Customer Details");
        showDetailsButton.addActionListener(e -> showCustomerDetails());

        JButton addCarButton = new JButton("Add New Car");
        addCarButton.addActionListener(e -> addNewCar());

        JButton deleteCarButton = new JButton("Delete Car");
        deleteCarButton.addActionListener(e -> deleteCar());

        getContentPane().add(nameLabel);
        getContentPane().add(customerNameField);
        getContentPane().add(carLabel);
        getContentPane().add(carComboBox);
        getContentPane().add(paymentLabel);
        getContentPane().add(paymentComboBox);
        getContentPane().add(cardNumberLabel);
        getContentPane().add(cardNumberField);
        getContentPane().add(mobileNumberLabel);
        getContentPane().add(mobileNumberField);
        getContentPane().add(rentalTimeLabel);
        getContentPane().add(rentalTimeField);
        getContentPane().add(amountLabel);
        getContentPane().add(amountField);
        getContentPane().add(rentButton);
        getContentPane().add(showDetailsButton);
        getContentPane().add(addCarButton);
        getContentPane().add(deleteCarButton);
    }

    private void initializeCars() {
        availableCars = new ArrayList<>();
        availableCars.add(new Car("MARUTI SUZUKI-50 PER H", 100.0, 24));
        availableCars.add(new Car("MAHINDRA THAR-60 PER H", 120.0, 24));
        availableCars.add(new Car("TATA HARRIER-70 PER H", 125.0, 24));

        for (Car car : availableCars) {
            carComboBox.addItem(car);
        }
    }

    private void rentCar() {
        String customerName = customerNameField.getText();
        String mobileNumber = mobileNumberField.getText();
        if (!isValidMobileNumber(mobileNumber)) {
            JOptionPane.showMessageDialog(this, "Invalid mobile number. Please enter a 10-digit number.", "Invalid Mobile Number", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!isValidCustomerName(customerName)) {
            JOptionPane.showMessageDialog(this, "Invalid customer name. Name cannot contain digits.", "Invalid Customer Name", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Car selectedCar = (Car) carComboBox.getSelectedItem();
        String paymentOption = (String) paymentComboBox.getSelectedItem();
        String cardNumber = cardNumberField.getText();
        int rentalHours = Integer.parseInt(rentalTimeField.getText());

        double amount = selectedCar.getPrice() * rentalHours;
        amountField.setText(String.valueOf(amount));

        boolean alreadyRegistered = customers.stream().anyMatch(customer -> customer.selectedCar.equals(selectedCar));
        if (alreadyRegistered) {
            JOptionPane.showMessageDialog(this, "Car is already registered.");
            return;
        }

        Customer customer = new Customer(customerName, selectedCar, paymentOption, cardNumber, mobileNumber, amount, rentalHours);
        customers.add(customer);

        JOptionPane.showMessageDialog(this, "Car Rented Successfully!");

        customerNameField.setText("");
        rentalTimeField.setText("");
    }

    private boolean isValidMobileNumber(String mobileNumber) {
        return mobileNumber.matches("\\d{10}");
    }

    private boolean isValidCustomerName(String name) {
        return !name.matches(".*\\d.*");
    }

    private void showCustomerDetails() {
        StringBuilder details = new StringBuilder();
        for (Customer customer : customers) {
            details.append(customer.toString()).append("\n\n");
        }

        if (details.length() > 0) {
            JOptionPane.showMessageDialog(this, details.toString(), "Customer Details", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No customers yet.", "Customer Details", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void addNewCar() {
        String carName = JOptionPane.showInputDialog(this, "Enter the name of the new car:");
        double carPrice = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter the price of the new car:"));
        int rentalTime = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the rental time for the new car (hours):"));

        Car newCar = new Car(carName, carPrice, rentalTime);
        availableCars.add(newCar);
        carComboBox.addItem(newCar);
        JOptionPane.showMessageDialog(this, "New Car Added Successfully!");
    }

    private void deleteCar() {
        Car selectedCar = (Car) carComboBox.getSelectedItem();
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete " + selectedCar.name + "?",
                "Confirm Deletion", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            availableCars.remove(selectedCar);
            carComboBox.removeItem(selectedCar);
            JOptionPane.showMessageDialog(this, "Car Deleted Successfully!");
        }
    }

    public static void main(String[] args) {

    }
}
