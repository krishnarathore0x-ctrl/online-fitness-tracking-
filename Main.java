// MAIN DASHBOARD
    private void showDashboard() {
            getContentPane().removeAll();

                    mainPanel = new JPanel(new BorderLayout());
                            mainPanel.setBackground(brand50);

                                    // Top header
                                            JPanel header = new JPanel(new BorderLayout());
                                                    header.setBackground(brand700);
                                                            header.setBorder(new EmptyBorder(15, 20, 15, 20));

                                                                    JLabel logo = new JLabel("FitTrack");
                                                                            logo.setForeground(white);
                                                                                    logo.setFont(new Font("Inter", Font.BOLD, 26));

                                                                                            JButton themeButton = new JButton("Toggle Dark Mode");
                                                                                                    themeButton.addActionListener(e -> toggleDarkMode());

                                                                                                            header.add(logo, BorderLayout.WEST);
                                                                                                                    header.add(themeButton, BorderLayout.EAST);

                                                                                                                            // Sidebar
                                                                                                                                    sidebar = new JPanel();
                                                                                                                                            sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
                                                                                                                                                    sidebar.setBackground(brand100);
                                                                                                                                                            sidebar.setBorder(new EmptyBorder(20, 12, 20, 12));
                                                                                                                                                                    sidebar.setPreferredSize(new Dimension(190, 0));

                                                                                                                                                                            addMenuButton("Dashboard", () -> showHome());
                                                                                                                                                                                    addMenuButton("Workout Plans", () -> showWorkouts());
                                                                                                                                                                                            addMenuButton("Fitness Tracking", () -> showTracking());
                                                                                                                                                                                                    addMenuButton("Progress", () -> showProgress());
                                                                                                                                                                                                            addMenuButton("Logout", () -> showLogin());

                                                                                                                                                                                                                    // Main content
                                                                                                                                                                                                                            contentPanel = new JPanel(new BorderLayout());
                                                                                                                                                                                                                                    contentPanel.setBackground(brand50);
                                                                                                                                                                                                                                            contentPanel.setBorder(new EmptyBorder(25, 25, 25, 25));

                                                                                                                                                                                                                                                    mainPanel.add(header, BorderLayout.NORTH);
                                                                                                                                                                                                                                                            mainPanel.add(sidebar, BorderLayout.WEST);
                                                                                                                                                                                                                                                                    mainPanel.add(contentPanel, BorderLayout.CENTER);

                                                                                                                                                                                                                                                                            add(mainPanel);

                                                                                                                                                                                                                                                                                    showHome();

                                                                                                                                                                                                                                                                                            revalidate();
                                                                                                                                                                                                                                                                                                    repaint();
                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                            // SIDEBAR BUTTONS
                                                                                                                                                                                                                                                                                                                private void addMenuButton(String text, Runnable action) {
                                                                                                                                                                                                                                                                                                                        JButton button = new JButton(text);
                                                                                                                                                                                                                                                                                                                                button.setMaximumSize(new Dimension(170, 42));
                                                                                                                                                                                                                                                                                                                                        button.setAlignmentX(Component.CENTER_ALIGNMENT);
                                                                                                                                                                                                                                                                                                                                                button.setBackground(white);
                                                                                                                                                                                                                                                                                                                                                        button.setForeground(brand700);
                                                                                                                                                                                                                                                                                                                                                                button.setFocusPainted(false);

                                                                                                                                                                                                                                                                                                                                                                        button.addActionListener(e -> action.run());

                                                                                                                                                                                                                                                                                                                                                                                sidebar.add(button);
                                                                                                                                                                                                                                                                                                                                                                                        sidebar.add(Box.createVerticalStrut(12));
                                                                                                                                                                                                                                                                                                                                                                                            }