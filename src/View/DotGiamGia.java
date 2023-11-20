package View;

import Model.DanhSachGiamGiaInfo;
import Model.DanhSachSanPhaminfo;
import Model.LichSuGiamGia;
import Service.DoiGiamGiaRepository;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class DotGiamGia extends javax.swing.JFrame {

    private DefaultTableModel dtm1 = new DefaultTableModel();
    private DefaultTableModel dtm2 = new DefaultTableModel();
    private ArrayList<DanhSachSanPhaminfo> listSP = new ArrayList<>();
    private ArrayList<LichSuGiamGia> ListLS = new ArrayList<>();
    private ArrayList<DanhSachGiamGiaInfo> listGG = new ArrayList<>();
    private List<DanhSachSanPhaminfo> selectedProductsList = new ArrayList<>();
    private List<ProductWithQuantity> selectedProductsListt = new ArrayList<>();

    private DoiGiamGiaRepository listSV = new DoiGiamGiaRepository();

    public DotGiamGia() {
        initComponents();
        dtm2 = (DefaultTableModel) tblDSGG.getModel();
        dtm1 = (DefaultTableModel) tblDSSP.getModel();
        loadTable1();
        LoadTable2();
    }

    public void LoadTable2() {
        dtm2.setRowCount(0);
        listGG = listSV.getAllGiamGia();
        for (DanhSachGiamGiaInfo ds : listGG) {
            Object[] rowdata = {
                ds.getMaGiamGia(),
                ds.getTenDotGiamGia(),
                ds.getNgayBatDau(),
                ds.getNgayKetThuc(),
                ds.getPhanTramGiamGia(),
                ds.isTrangThai() ? "Đang hoạt động" : "Đã kết thúc"
            };
            dtm2.addRow(rowdata);
        }
    }

    public void loadTable1() {
        dtm1.setRowCount(0);
        listSP = listSV.getAllSanPham();
        for (DanhSachSanPhaminfo ds : listSP) {
            Object[] rowdata = {
                ds.getSanPhamId(),
                ds.getSanPhamName(),
                ds.getFabricType(),
                ds.getDesigns(),
                ds.getSize(),
                ds.getColor(),
                ds.getMoney(),
                ds.getQuantity()
            };
            dtm1.addRow(rowdata);
        }
    }

    private class ProductWithQuantity {

        private DanhSachSanPhaminfo product;
        private int quantity;

        public ProductWithQuantity(DanhSachSanPhaminfo product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        public DanhSachSanPhaminfo getProduct() {
            return product;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    private boolean containsProductID(int productID, DefaultTableModel model) {
        // Check if the product ID already exists in the table
        for (int row = 0; row < model.getRowCount(); row++) {
            if ((int) model.getValueAt(row, 0) == productID) {
                return true; // Product ID already exists in the table
            }
        }
        return false; // Product ID does not exist in the table
    }

    private void displaySanPhamInfo(ArrayList<DanhSachSanPhaminfo> productList) {
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);

        for (DanhSachSanPhaminfo ds : productList) {
            Object[] rowData = {
                ds.getSanPhamId(),
                ds.getSanPhamName(),
                ds.getFabricType(),
                ds.getDesigns(),
                ds.getSize(),
                ds.getColor(),
                ds.getMoney(),
                ds.getQuantity()
            };
            model.addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDotGiamGia = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDSSP = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDSGG = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTenDotGiamGia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMucGiamGia = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        btnTaoMoi = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rdoDangHoatDong = new javax.swing.JRadioButton();
        rdoDaKetThuc = new javax.swing.JRadioButton();
        btnThemSanPham = new javax.swing.JButton();
        btnXoaSanPham = new javax.swing.JButton();
        jdcNgayBatDau = new com.toedter.calendar.JDateChooser();
        jdcNgayKetThuc = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đợt giảm giá");
        setBackground(new java.awt.Color(204, 255, 255));
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Bee Clothes");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dress (2).png"))); // NOI18N
        jLabel2.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(29, 29, 29))
        );

        btnDotGiamGia.setBackground(new java.awt.Color(255, 204, 204));
        btnDotGiamGia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDotGiamGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/discount (1).png"))); // NOI18N
        btnDotGiamGia.setText("Đợt giảm giá");
        btnDotGiamGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotGiamGiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDotGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDotGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblDSSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm ", "Tên sản phẩm", "Loại", "Kiểu dáng", "Kích cỡ", "Màu sắc", "Giá tiền", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSSPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblDSSPMouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(tblDSSP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblDSGG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đợt giảm giá", "Tên đợt giảm giá", "Ngày bắt đầu", "Ngày kết thúc", "Mức giảm giá", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSGG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSGGMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDSGG);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Danh sách sản phảm");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Danh sách giảm giá");

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Tên đợt giảm giá:");

        jLabel7.setText("Mức giảm giá (%):");

        btnLuu.setBackground(new java.awt.Color(255, 204, 204));
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        btnLuu.setText("Thêm đợt");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnTaoMoi.setBackground(new java.awt.Color(255, 204, 204));
        btnTaoMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Refresh.png"))); // NOI18N
        btnTaoMoi.setText("Làm mới");
        btnTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoiActionPerformed(evt);
            }
        });

        btnCapNhat.setBackground(new java.awt.Color(255, 204, 204));
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/updated (1).png"))); // NOI18N
        btnCapNhat.setText("Sửa đợt");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 204, 204));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa đợt");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel8.setText("Ngày bắt đầu:");

        jLabel9.setText("Ngày kết thúc:");

        jLabel10.setText("Trạng thái:");

        buttonGroup1.add(rdoDangHoatDong);
        rdoDangHoatDong.setText("Đang hoạt động");

        buttonGroup1.add(rdoDaKetThuc);
        rdoDaKetThuc.setText("Đã kết thúc");

        btnThemSanPham.setBackground(new java.awt.Color(255, 204, 204));
        btnThemSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add-file.png"))); // NOI18N
        btnThemSanPham.setText("Thêm sản phẩm");
        btnThemSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSanPhamActionPerformed(evt);
            }
        });

        btnXoaSanPham.setBackground(new java.awt.Color(255, 204, 204));
        btnXoaSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete.png"))); // NOI18N
        btnXoaSanPham.setText("Xóa sản phẩm");
        btnXoaSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSanPhamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThemSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTenDotGiamGia)
                    .addComponent(txtMucGiamGia)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCapNhat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLuu, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnTaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(rdoDangHoatDong)
                                .addGap(18, 18, 18)
                                .addComponent(rdoDaKetThuc))
                            .addComponent(jLabel7)
                            .addComponent(jdcNgayBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdcNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenDotGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMucGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(8, 8, 8)
                .addComponent(jdcNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(14, 14, 14)
                .addComponent(jdcNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoDangHoatDong)
                    .addComponent(rdoDaKetThuc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnThemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tạo đợt giảm giá");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Sản phẩm giảm giá");

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Loại", "Kiểu dáng", "Kích cỡ", "Màu sắc", "Giá tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoiActionPerformed
        txtTenDotGiamGia.setText("");
        jdcNgayBatDau.setDate(null);
        jdcNgayKetThuc.setDate(null);
        txtMucGiamGia.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnTaoMoiActionPerformed

    private void btnDotGiamGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotGiamGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDotGiamGiaActionPerformed

    private void tblDSSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSSPMouseClicked
        int[] selectedRows = tblDSSP.getSelectedRows();

        if (selectedRows.length > 0) {
            DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();

            for (int selectedRow : selectedRows) {
                DanhSachSanPhaminfo selectedProduct = listSP.get(selectedRow);

                // Check if the product is already selected in the table
                boolean alreadySelectedInTable = containsProductID(selectedProduct.getSanPhamId(), model);

                // Check if the product is already selected in the list
                boolean alreadySelectedInList = selectedProductsList.stream()
                        .anyMatch(item -> item.getSanPhamId() == selectedProduct.getSanPhamId());

                if (!alreadySelectedInTable && !alreadySelectedInList) {
                    // Add the product to the list
                    selectedProductsList.add(selectedProduct);

                    Object[] rowData = {
                        selectedProduct.getSanPhamId(),
                        selectedProduct.getSanPhamName(),
                        selectedProduct.getFabricType(),
                        selectedProduct.getDesigns(),
                        selectedProduct.getSize(),
                        selectedProduct.getColor(),
                        selectedProduct.getMoney()
                    };

                    model.addRow(rowData);
                } else {
                    // Show a message if the product is already selected
                    JOptionPane.showMessageDialog(this, "Sản phẩm đã được chọn.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_tblDSSPMouseClicked

    private void tblDSGGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSGGMouseClicked
        int selectedRow = tblDSGG.getSelectedRow();
        DefaultTableModel dtm3 = (DefaultTableModel) tblSanPham.getModel();
        dtm3.setRowCount(0);
        if (selectedRow != -1) {
            DanhSachGiamGiaInfo selectedPromotion = listGG.get(selectedRow);
            int dotGGID = (int) tblDSGG.getValueAt(selectedRow, 0);
            ArrayList<Integer> i = listSV.getAllSPtoGG(dotGGID);
            for (DanhSachSanPhaminfo ds : listSP) {
                if (i.contains(ds.getSanPhamId())) {

                    Object[] rowdata = {
                        ds.getSanPhamId(),
                        ds.getSanPhamName(),
                        ds.getFabricType(),
                        ds.getDesigns(),
                        ds.getSize(),
                        ds.getColor(),
                        ds.getMoney()
                    };
                    dtm3.addRow(rowdata);
                }
            }
            // Display the selected promotion information in the text fields
            txtTenDotGiamGia.setText(selectedPromotion.getTenDotGiamGia());
            txtMucGiamGia.setText(String.valueOf(selectedPromotion.getPhanTramGiamGia()));

            // Set the calendar of JDateChooser components directly with the Date objects
            jdcNgayBatDau.setDate(selectedPromotion.getNgayBatDau());
            jdcNgayKetThuc.setDate(selectedPromotion.getNgayKetThuc());

            // Set the radio button based on the promotion status
            if (selectedPromotion.isTrangThai()) {
                rdoDangHoatDong.setSelected(true);
                rdoDaKetThuc.setSelected(false);  // Unselect the other radio button
            } else {
                rdoDangHoatDong.setSelected(false);  // Unselect the other radio button
                rdoDaKetThuc.setSelected(true);
            }
        }
    }//GEN-LAST:event_tblDSGGMouseClicked

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // Lấy giá trị nhập từ các thành phần giao diện người dùng
        String tenDotGiamGia = txtTenDotGiamGia.getText().trim();
        String mucGiamGiaStr = txtMucGiamGia.getText().trim();
        Date ngayBatDau = jdcNgayBatDau.getDate();
        Date ngayKetThuc = jdcNgayKetThuc.getDate();

        // Xác thực rằng các trường bắt buộc không rỗng
        if (tenDotGiamGia.isEmpty() || mucGiamGiaStr.isEmpty() || ngayBatDau == null || ngayKetThuc == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Chuyển đổi giá trị số sau khi xác thực
            float phanTramGiamGia = Float.parseFloat(mucGiamGiaStr);

            // Kiểm tra xem ngày nhập vào có nằm trong khoảng từ 2021 đến 2024 không
            int startYear = 2021;
            int endYear = 2024;

            Calendar cal = Calendar.getInstance();
            cal.setTime(ngayBatDau);
            int startYearInput = cal.get(Calendar.YEAR);

            cal.setTime(ngayKetThuc);
            int endYearInput = cal.get(Calendar.YEAR);

            if (startYearInput < startYear || endYearInput > endYear || startYearInput > endYear || endYearInput < startYear) {
                JOptionPane.showMessageDialog(this, "Ngày phải nằm trong khoảng từ " + startYear + " đến " + endYear + ".", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Tạo một đối tượng DanhSachGiamGiaInfo với các giá trị đã lấy
            DanhSachGiamGiaInfo discountInfo = new DanhSachGiamGiaInfo(0, tenDotGiamGia, ngayBatDau, ngayKetThuc, phanTramGiamGia, rootPaneCheckingEnabled);

            // Gọi phương thức addGiamGia từ lớp DoiGiamGiaRepository để lưu thông tin vào cơ sở dữ liệu
            DoiGiamGiaRepository service = new DoiGiamGiaRepository();
            service.addGiamGia(discountInfo);

            // Làm mới bảng sau khi thêm một ưu đãi mới
            LoadTable2();

            // Hiển thị thông báo thành công
            JOptionPane.showMessageDialog(this, "Thêm đợt giảm giá thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá trị số không hợp lệ.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedRowIndex = tblDSGG.getSelectedRow();

        if (selectedRowIndex != -1) {
            int confirmation = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa đợt giảm giá này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                int maGiamGia = (int) tblDSGG.getValueAt(selectedRowIndex, 0);
                listSV.deleteGiamGia(maGiamGia);
                LoadTable2(); // Refresh the table after deletion

                // Display a success message
                JOptionPane.showMessageDialog(null, "Xóa đợt giảm giá thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một đợt giảm giá để xóa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        int selectedRowIndex = tblDSGG.getSelectedRow();

        if (selectedRowIndex != -1) {
            int maGiamGia = (int) tblDSGG.getValueAt(selectedRowIndex, 0);
            DanhSachGiamGiaInfo giamGiaInfo = listSV.getGiamGiaById(maGiamGia);

            // Set the fields in your update form with the values from giamGiaInfo
            giamGiaInfo.setTenDotGiamGia(txtTenDotGiamGia.getText());
            giamGiaInfo.setPhanTramGiamGia(Float.parseFloat(txtMucGiamGia.getText()));
            // Bạn cần phải xử lý chuyển đổi ngày từ chuỗi sang đối tượng java.util.Date
            // tương ứng với txtNgayBatDau và txtNgayKetThuc.
            // Sau đó, set ngày bắt đầu và ngày kết thúc cho giamGiaInfo.

            if (rdoDangHoatDong.isSelected()) {
                giamGiaInfo.setTrangThai(true);
            } else if (rdoDaKetThuc.isSelected()) {
                giamGiaInfo.setTrangThai(false);
            }

            // Gọi phương thức UpdateGiamGia để cập nhật dữ liệu trong cơ sở dữ liệu
            listSV.UpdateGiamGia(giamGiaInfo);

            // Sau khi cập nhật, cần load lại danh sách giảm giá để cập nhật bảng
            LoadTable2();

            // Thông báo sửa thành công
            JOptionPane.showMessageDialog(null, "Cập nhật thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một đợt giảm giá để cập nhật.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnThemSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSanPhamActionPerformed
        int row = tblDSGG.getSelectedRow();

        if (row == -1) {
            // Hiển thị thông báo cho người dùng nếu không có đợt giảm giá nào được chọn
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một đợt giảm giá để thêm sản phẩm.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int dotGiamGiaID = (int) tblDSGG.getValueAt(row, 0);

        // Hiển thị hộp thoại yes/no option để xác nhận thêm sản phẩm
        int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thêm sản phẩm vào đợt giảm giá?", "Xác nhận", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            // Thêm sản phẩm vào đợt giảm giá
            for (DanhSachSanPhaminfo ds : selectedProductsList) {
                int sanPhamId = ds.getSanPhamId();
                listSV.themSanPhamtoDotGG(sanPhamId, dotGiamGiaID);
            }

            // Hiển thị thông báo thành công
            JOptionPane.showMessageDialog(this, "Sản phẩm đã được thêm vào đợt giảm giá thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnThemSanPhamActionPerformed

    private void btnXoaSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSanPhamActionPerformed
        // Lấy thông tin đợt giảm giá được chọn từ tblDSGG
        int selectedPromotionRow = tblDSGG.getSelectedRow();

        if (selectedPromotionRow == -1) {
            // Hiển thị thông báo cho người dùng nếu không có đợt giảm giá nào được chọn
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một đợt giảm giá.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Lấy thông tin sản phẩm được chọn từ tblSanPham
        int selectedProductRow = tblSanPham.getSelectedRow();

        if (selectedProductRow == -1) {
            // Hiển thị thông báo cho người dùng nếu không có sản phẩm nào được chọn
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một sản phẩm để xóa khỏi đợt giảm giá.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Hiển thị hộp thoại yes/no option để xác nhận xóa
        int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa sản phẩm khỏi đợt giảm giá?", "Xác nhận", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            // Lấy mã sản phẩm và mã đợt giảm giá từ bảng
            int chiTietSanPhamId = (int) tblSanPham.getValueAt(selectedProductRow, 0);
            int dotGiamGiaId = (int) tblDSGG.getValueAt(selectedPromotionRow, 0);

            // Gọi phương thức xoaSanPhamKhoiDotGG từ đối tượng service để xóa sản phẩm khỏi đợt giảm giá
            DoiGiamGiaRepository service = new DoiGiamGiaRepository();
            service.xoaSanPhamKhoiDotGG(chiTietSanPhamId, dotGiamGiaId);

            // Hiển thị thông báo cho người dùng
            JOptionPane.showMessageDialog(this, "Sản phẩm đã được xóa khỏi đợt giảm giá.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

            // Cập nhật lại bảng hiển thị sản phẩm hoặc làm bất kỳ xử lý nào khác cần thiết
            // (ví dụ: load lại danh sách sản phẩm, cập nhật bảng, ...)
            // Ví dụ: Cập nhật lại bảng hiển thị sản phẩm sau khi xóa
            DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
            model.removeRow(selectedProductRow);
        }
    }//GEN-LAST:event_btnXoaSanPhamActionPerformed

    private void tblDSSPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSSPMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDSSPMouseEntered

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked

    }//GEN-LAST:event_tblSanPhamMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DotGiamGia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DotGiamGia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DotGiamGia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DotGiamGia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DotGiamGia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnDotGiamGia;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnTaoMoi;
    private javax.swing.JButton btnThemSanPham;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaSanPham;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JDateChooser jdcNgayBatDau;
    private com.toedter.calendar.JDateChooser jdcNgayKetThuc;
    private javax.swing.JRadioButton rdoDaKetThuc;
    private javax.swing.JRadioButton rdoDangHoatDong;
    private javax.swing.JTable tblDSGG;
    private javax.swing.JTable tblDSSP;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtMucGiamGia;
    private javax.swing.JTextField txtTenDotGiamGia;
    // End of variables declaration//GEN-END:variables

}
