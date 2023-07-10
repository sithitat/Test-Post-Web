/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpostweb;

import java.awt.List;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rbtencryption.RbtEncryption;
        
/**
 *
 * @author Administrator
 */
public class PostWebManualV2 extends javax.swing.JFrame {
    private static HttpURLConnection con;
    
    
    // Set the connect timeout value in milliseconds
    private final int CONNECT_TIMEOUT = 15000;
    // Set the read timeout value in milliseconds
    private final int READ_TIMEOUT = 60000;

    private HttpURLConnection httpConn;
    private String postData;
    private String charset;    
    
    /**
     * Creates new form PostWebManual
     */
    public PostWebManualV2() {
        initComponents();
        
        // Set Group
        ButtonGroup gRdbPatTyp = new ButtonGroup();
        gRdbPatTyp.add(rbtContentType0);
        gRdbPatTyp.add(rbtContentType1);
        gRdbPatTyp.add(rbtContentType2);
        gRdbPatTyp.add(rbtContentType3);
        
        ButtonGroup gRequestMethodPost = new ButtonGroup();
        gRequestMethodPost.add(rbtRequestMethodPost);
        gRequestMethodPost.add(rbtRequestMethodGet);
        
        ButtonGroup gRdbRequestType = new ButtonGroup();
        gRdbRequestType.add(jrbRequestType0);
        gRdbRequestType.add(jrbRequestType1);
        gRdbRequestType.add(jrbRequestType2);
        gRdbRequestType.add(jrbRequestType3);
        gRdbRequestType.add(jrbRequestType4);
        gRdbRequestType.add(jrbRequestType5);
        gRdbRequestType.add(jrbRequestType6);
        
        ButtonGroup gRdbCrypte = new ButtonGroup();
        gRdbCrypte.add(rbtEncrypte);
        gRdbCrypte.add(rbtDecrypte);
        

    }

    /*
    public PostWebManualV2(String requestURL, String charset, Map<String, String> headers, String postData) throws IOException {
        this.charset = charset;
        this.postData = postData;
        URL url = new URL(requestURL);
        httpConn = (HttpURLConnection) url.openConnection();
        httpConn.setConnectTimeout(CONNECT_TIMEOUT);
        httpConn.setReadTimeout(READ_TIMEOUT);
        httpConn.setUseCaches(false);
        httpConn.setDoOutput(true);    // indicates POST method
        httpConn.setDoInput(true);
        httpConn.setRequestProperty("Content-Type", "text/plain");
        if (headers != null && headers.size() > 0) {
            Iterator<String> it = headers.keySet().iterator();
            while (it.hasNext()) {
                String key = it.next();
                String value = headers.get(key);
                httpConn.setRequestProperty(key, value);
            }
        }
    }

    public PostWebManualV2(String requestURL, String charset, Map<String, String> headers) throws IOException {
        this(requestURL, charset, headers, null);
    }

    public PostWebManualV2(String requestURL, String charset) throws IOException {
        this(requestURL, charset, null, null);
    }    
    */
    /**
     * Adds a header to the request
     *
     * @param key
     * @param value
     */
    /*
    public void addHeader(String key, String value) {
        httpConn.setRequestProperty(key, value);
    }
    */
    /**
     * Adds a form field to the request
     *
     * @param postData
     */
    /*
    public void setPostData(String postData) {
        this.postData = postData;
    }
    */
    /**
     * Convert the request data to a byte array
     *
     * @return
     */
    /*
    private byte[] getParamsByte() {
        byte[] result = null;
        try {
            result = this.postData.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
    */
    /**
     * Completes the request and receives response from the server.
     *
     * @return String as response in case the server returned
     * status OK, otherwise an exception is thrown.
     * @throws IOException
     */
    /*
    public String finish() throws IOException {
        String response = "";
        byte[] postDataBytes = this.getParamsByte();
        httpConn.getOutputStream().write(postDataBytes);
        // Check the http status
        int status = httpConn.getResponseCode();
        if (status == HttpURLConnection.HTTP_OK) {
            ByteArrayOutputStream result = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int length;
            while ((length = httpConn.getInputStream().read(buffer)) != -1) {
                result.write(buffer, 0, length);
            }
            response = result.toString(this.charset);
            httpConn.disconnect();
        } else {
            throw new IOException("Server returned non-OK status: " + status);
        }
        return response;
    } 
    
    */
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txaURL = new javax.swing.JTextArea();
        lblPatientID6 = new javax.swing.JLabel();
        lblPatientID8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaPostData = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaPostDataEncode = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResult = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaContent = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txaParameter = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstArrJson = new javax.swing.JList<>();
        rbtContentType0 = new javax.swing.JRadioButton();
        rbtContentType1 = new javax.swing.JRadioButton();
        rbtContentType2 = new javax.swing.JRadioButton();
        rbtContentType3 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lblPatientID7 = new javax.swing.JLabel();
        rbtRequestMethodPost = new javax.swing.JRadioButton();
        rbtRequestMethodGet = new javax.swing.JRadioButton();
        lblPatientID9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        txaAuthorization = new javax.swing.JTextArea();
        lblPatientID10 = new javax.swing.JLabel();
        lblPatientID11 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txaAuthCode = new javax.swing.JTextArea();
        lblPatientID12 = new javax.swing.JLabel();
        jrbRequestType0 = new javax.swing.JRadioButton();
        jrbRequestType1 = new javax.swing.JRadioButton();
        jrbRequestType2 = new javax.swing.JRadioButton();
        jtxtTokenType = new javax.swing.JTextField();
        lblPatientID13 = new javax.swing.JLabel();
        jtxtTransactionNo = new javax.swing.JTextField();
        jrbRequestType3 = new javax.swing.JRadioButton();
        jrbRequestType4 = new javax.swing.JRadioButton();
        jrbRequestType5 = new javax.swing.JRadioButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        tabRequestDetail = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblPatientID16 = new javax.swing.JLabel();
        rbtEncrypte = new javax.swing.JRadioButton();
        rbtDecrypte = new javax.swing.JRadioButton();
        txtAESCipher = new javax.swing.JTextField();
        lblPatientID17 = new javax.swing.JLabel();
        lblPatientID18 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txaAESKey = new javax.swing.JTextArea();
        txtAESReplace = new javax.swing.JTextField();
        lblPatientID19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblPatientID14 = new javax.swing.JLabel();
        jtxtAuthorizeKey = new javax.swing.JTextField();
        jtxtAuthorizeDate = new javax.swing.JTextField();
        lblPatientID15 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txaAuthorizeData = new javax.swing.JTextArea();
        jrbRequestType6 = new javax.swing.JRadioButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Post");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 30));

        jScrollPane5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        txaURL.setColumns(20);
        txaURL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txaURL.setLineWrap(true);
        txaURL.setRows(3);
        jScrollPane5.setViewportView(txaURL);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 1440, 50));

        lblPatientID6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPatientID6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientID6.setText("Content-Type");
        getContentPane().add(lblPatientID6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 127, 37));

        lblPatientID8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPatientID8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientID8.setText("Parameter");
        getContentPane().add(lblPatientID8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 127, 30));

        txaPostData.setColumns(20);
        txaPostData.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        txaPostData.setLineWrap(true);
        txaPostData.setRows(5);
        jScrollPane3.setViewportView(txaPostData);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 1020, 150));

        txaPostDataEncode.setColumns(20);
        txaPostDataEncode.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        txaPostDataEncode.setLineWrap(true);
        txaPostDataEncode.setRows(5);
        jScrollPane4.setViewportView(txaPostDataEncode);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 390, 170));

        txaResult.setColumns(20);
        txaResult.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        txaResult.setLineWrap(true);
        txaResult.setRows(5);
        jScrollPane1.setViewportView(txaResult);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 1020, 180));

        txaContent.setColumns(20);
        txaContent.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txaContent.setRows(5);
        jScrollPane2.setViewportView(txaContent);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 390, 40));

        txaParameter.setColumns(20);
        txaParameter.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 10)); // NOI18N
        txaParameter.setRows(5);
        jScrollPane6.setViewportView(txaParameter);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 390, 290));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Post Original");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, 30));

        lstArrJson.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lstArrJson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstArrJsonMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(lstArrJson);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 590, 620, 170));

        rbtContentType0.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtContentType0.setText("application/x-www-form-urlencoded");
        getContentPane().add(rbtContentType0, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 250, -1));

        rbtContentType1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtContentType1.setText("application/json");
        getContentPane().add(rbtContentType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 130, -1));

        rbtContentType2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtContentType2.setText("multipart/form-data");
        getContentPane().add(rbtContentType2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 210, -1));

        rbtContentType3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtContentType3.setText("other");
        getContentPane().add(rbtContentType3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 130, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Post Skip SSL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 30));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Post KDMS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, 30));

        lblPatientID7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPatientID7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientID7.setText("Request Method");
        getContentPane().add(lblPatientID7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 150, 40));

        rbtRequestMethodPost.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtRequestMethodPost.setText("Post");
        getContentPane().add(rbtRequestMethodPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        rbtRequestMethodGet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtRequestMethodGet.setText("Get");
        getContentPane().add(rbtRequestMethodGet, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        lblPatientID9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPatientID9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientID9.setText("Get Access Token ");
        getContentPane().add(lblPatientID9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 130, 40));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Post Use SSL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 140, 30));

        txaAuthorization.setColumns(20);
        txaAuthorization.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txaAuthorization.setRows(5);
        jScrollPane8.setViewportView(txaAuthorization);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 160, 610, 30));

        lblPatientID10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPatientID10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientID10.setText("Return Data");
        getContentPane().add(lblPatientID10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 120, 40));

        lblPatientID11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPatientID11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientID11.setText("Request Auth Code");
        getContentPane().add(lblPatientID11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 130, 40));

        txaAuthCode.setColumns(20);
        txaAuthCode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txaAuthCode.setRows(5);
        jScrollPane9.setViewportView(txaAuthCode);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 740, 30));

        lblPatientID12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPatientID12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientID12.setText("Request Type");
        getContentPane().add(lblPatientID12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 120, 40));

        jrbRequestType0.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jrbRequestType0.setText("Get Auth Code");
        getContentPane().add(jrbRequestType0, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, -1, 20));

        jrbRequestType1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jrbRequestType1.setText("Get Token");
        getContentPane().add(jrbRequestType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, -1, 20));

        jrbRequestType2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jrbRequestType2.setText("Normal Data");
        jrbRequestType2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbRequestType2ActionPerformed(evt);
            }
        });
        getContentPane().add(jrbRequestType2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, -1, -1));

        jtxtTokenType.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(jtxtTokenType, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 120, 30));

        lblPatientID13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPatientID13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientID13.setText("Transaction No");
        getContentPane().add(lblPatientID13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 130, 40));

        jtxtTransactionNo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(jtxtTransactionNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 740, 30));

        jrbRequestType3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jrbRequestType3.setText("Check Eligible");
        getContentPane().add(jrbRequestType3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 70, 120, 20));

        jrbRequestType4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jrbRequestType4.setText("Payment QR");
        jrbRequestType4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbRequestType4ActionPerformed(evt);
            }
        });
        getContentPane().add(jrbRequestType4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 70, 120, 20));

        jrbRequestType5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jrbRequestType5.setText("Normal Data(Auth)");
        jrbRequestType5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbRequestType5ActionPerformed(evt);
            }
        });
        getContentPane().add(jrbRequestType5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, -1, -1));

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setText("Json Parser");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, 30));

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setText("Base64 to Image");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 140, 30));

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setText("Image to Base64");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 140, 30));

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setText("AES 256");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 140, 30));

        tabRequestDetail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tabRequestDetail.addTab("tab3", jPanel3);
        tabRequestDetail.addTab("tab4", jPanel4);
        tabRequestDetail.addTab("tab5", jPanel5);
        tabRequestDetail.addTab("tab6", jPanel6);
        tabRequestDetail.addTab("tab7", jPanel7);
        tabRequestDetail.addTab("tab8", jPanel8);
        tabRequestDetail.addTab("tab9", jPanel9);
        tabRequestDetail.addTab("tab10", jPanel10);

        lblPatientID16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPatientID16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientID16.setText("Method");

        rbtEncrypte.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtEncrypte.setText("Encrypt");

        rbtDecrypte.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtDecrypte.setText("Decrypt");

        txtAESCipher.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtAESCipher.setText("AES/ECB/PKCS5Padding");

        lblPatientID17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPatientID17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientID17.setText("Cipher");

        lblPatientID18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPatientID18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientID18.setText("Key");

        txaAESKey.setColumns(20);
        txaAESKey.setRows(5);
        jScrollPane11.setViewportView(txaAESKey);

        txtAESReplace.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtAESReplace.setText("AES/ECB/PKCS5Padding");

        lblPatientID19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPatientID19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientID19.setText("Replace");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientID16, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientID17, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientID18, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientID19, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbtEncrypte, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtDecrypte, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAESCipher, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAESReplace))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientID16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtDecrypte)
                        .addComponent(rbtEncrypte)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientID17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAESCipher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPatientID18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAESReplace)
                    .addComponent(lblPatientID19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblPatientID18.getAccessibleContext().setAccessibleName("");

        tabRequestDetail.addTab("AES 256", jPanel2);

        lblPatientID14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPatientID14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientID14.setText("Gen MD5");

        jtxtAuthorizeKey.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jtxtAuthorizeKey.setText("bitpayment2021");

        jtxtAuthorizeDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        lblPatientID15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPatientID15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientID15.setText("Authorize Data");

        txaAuthorizeData.setColumns(20);
        txaAuthorizeData.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txaAuthorizeData.setRows(5);
        jScrollPane10.setViewportView(txaAuthorizeData);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPatientID15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPatientID14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtAuthorizeKey, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtAuthorizeDate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientID14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtAuthorizeDate, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jtxtAuthorizeKey))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPatientID15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabRequestDetail.addTab("Payment QR", jPanel1);

        getContentPane().add(tabRequestDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 410, 240));

        jrbRequestType6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jrbRequestType6.setText("AES 256");
        jrbRequestType6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbRequestType6ActionPerformed(evt);
            }
        });
        getContentPane().add(jrbRequestType6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 90, 120, -1));

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton10.setText("AES Replace");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 140, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String PostToWebWithOutSSL(){
        String sParaForPost;
        URL urlPost = null;
        StringBuilder contentSB = null;
        HttpURLConnection connHttpURL = null;
        HttpsURLConnection connHttpsURL = null;
        String sLine;
        String sReturnResult = "";
        String sContentType;
        String sRequestMethod;
        int postDataLength;
        String sParameter;
        String sURL;

        postDataLength = 0;
        sParameter = txaParameter.getText();
        sURL = txaURL.getText();

        if (rbtContentType0.isSelected()){
            // application/x-www-form-urlencoded
            sContentType = "application/x-www-form-urlencoded";
        }
        else if (rbtContentType1.isSelected()){
            // application/json
            sContentType = "application/json";
        }
        else if (rbtContentType2.isSelected()){
            // multipart/form-data
            sContentType = "multipart/form-data";
        }
        else if (rbtContentType3.isSelected()){
            sContentType = txaContent.getText();
        }
        else{
            sContentType = "application/x-www-form-urlencoded";
        }
        
        if (rbtRequestMethodGet.isSelected()){
            sRequestMethod = "GET";
        }
        else{
            sRequestMethod = "POST";
        }

        sParaForPost = sParameter.replace("\\", "");
        // sParaForPost = sParameter.replace("%", "%25");        
        
        byte[] postData = sParaForPost.getBytes(StandardCharsets.UTF_8);       // StandardCharsets.UTF_8

        postDataLength = postData.length;        
        
        try {
            
            try {
                urlPost = new URL(sURL);
            } catch (MalformedURLException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: urlPost - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: urlPost - " + ex.getMessage() + "\n");
            }
            
            try {
                //connHttpURL = (HttpURLConnection) urlPost.openConnection();
                SSLFix.execute();
                connHttpsURL = (HttpsURLConnection) urlPost.openConnection();
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: connHttpURL - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: connHttpURL - " + ex.getMessage() + "\n");
            }

            connHttpsURL.setDoOutput(true);
            connHttpsURL.setInstanceFollowRedirects(false);
            try {
                connHttpsURL.setRequestMethod(sRequestMethod);
            } catch (ProtocolException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: POST - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: POST - " + ex.getMessage() + "\n");
            }
            connHttpsURL.setRequestProperty("Content-Type", sContentType + "; charset=utf-8");
            connHttpsURL.setRequestProperty("Accept-Charset", "utf-8");
            connHttpsURL.setRequestProperty("Content-Length", Integer.toString(postDataLength ));
            connHttpsURL.setUseCaches(false);
            
            //SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            //connHttpsURL.setSSLSocketFactory(sslsocketfactory);
            
            try (DataOutputStream streamDO = new DataOutputStream(connHttpsURL.getOutputStream())) {
                streamDO.write(postData);
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: streamDO - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: streamDO - " + ex.getMessage() + "\n");
            }        
            
            try (BufferedReader buffReader = new BufferedReader(new InputStreamReader(connHttpsURL.getInputStream()))) {
                contentSB = new StringBuilder();

                while ((sLine = buffReader.readLine()) != null) {
                    contentSB.append(sLine);
                    contentSB.append(System.lineSeparator());
                    txaResult.append(sLine + "\n");
                }
                sReturnResult = contentSB.toString();
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: Result - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: Result - " + ex.getMessage() + "\n");
            } finally {
                sReturnResult = "";
            }
        } catch (Exception ex) {
            Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
            txaResult.append("Error: Main - " + ex.getMessage() + "\n");
        } finally {
            //connHttpURL.disconnect();
            connHttpsURL.disconnect();
        }

        return sReturnResult;
        
    }    
    
    private String SendDataToAPIMain(boolean bIsSSL){
        String sParaForPost;
        URL urlPost = null;
        StringBuilder contentSB = null;
        String sLine;
        String sReturnResult = "";
        String sContentType;
        String sRequestMethod;
        String sSetAuthCode = "";
        String sSetTransactionNo = "";
        String sSetAuthToken = "";
        String sSetTokenType = "";        
        int postDataLength;
        String sParameter;
        String sURL;

        String sDisplayMsg;
        String sEsbModule;
        String sAuthCode;
        String sAccessToken;
        String sTokenType;
        String sReturnCode;
        String sReturnMessage;
        String sRefId = "";
        String sTransactionNo = "";            
        String sAllData;
        String sAuthorizeKey;
        String sAuthorizeKeyMD5;
        String sAuthorizeDate;
        String sAuthorizeData;        
        
        HttpURLConnection connHttpURL = null;
        
        postDataLength = 0;
        sParameter = txaParameter.getText();
        sURL = txaURL.getText();

        if (rbtContentType0.isSelected()){
            // application/x-www-form-urlencoded
            sContentType = "application/x-www-form-urlencoded";
        }
        else if (rbtContentType1.isSelected()){
            // application/json
            sContentType = "application/json";
        }
        else if (rbtContentType2.isSelected()){
            // multipart/form-data
            sContentType = "multipart/form-data";
        }
        else if (rbtContentType3.isSelected()){
            sContentType = txaContent.getText();
        }
        else{
            sContentType = "application/x-www-form-urlencoded";
        }
        
        if (rbtRequestMethodGet.isSelected()){
            sRequestMethod = "GET";
        }
        else{
            sRequestMethod = "POST";
        }           
        
        try {
            
            try {
                urlPost = new URL(sURL);
            } catch (MalformedURLException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: urlPost - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: urlPost - " + ex.getMessage() + "\n");
            }
            
            try {
                if (bIsSSL == true) {
                    SSLFix.execute();
                    connHttpURL = (HttpsURLConnection) urlPost.openConnection();
                    // Additional SSL-specific configuration if needed
                } else {
                    connHttpURL = (HttpURLConnection) urlPost.openConnection();
                }
                // SSLFix.execute();
                // connHttpsURL = (HttpsURLConnection) urlPost.openConnection();
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: connHttpURL - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: connHttpURL - " + ex.getMessage() + "\n");
            }

            connHttpURL.setConnectTimeout(CONNECT_TIMEOUT);
            connHttpURL.setReadTimeout(READ_TIMEOUT);            
            connHttpURL.setDoInput(true);
            
            connHttpURL.setDoOutput(true);
            connHttpURL.setInstanceFollowRedirects(false);
            try {
                connHttpURL.setRequestMethod(sRequestMethod);
            } catch (ProtocolException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: POST - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: POST - " + ex.getMessage() + "\n");
            }
            connHttpURL.setRequestProperty("Content-Type", sContentType + "; charset=utf-8");
            connHttpURL.setRequestProperty("Accept-Charset", "utf-8");
            
            sParaForPost = sParameter.replace("\\", "");
            // sParaForPost = sParameter.replace("%", "%25");     
            
            if (jrbRequestType0.isSelected()){
                // Get Auth Code - Use Only Parameter Data
            }
            else if (jrbRequestType1.isSelected()){
                // Get Token - Use Only Parameter Data
                // @AUTH_CODE
                sSetAuthCode = txaAuthCode.getText();
                sParaForPost = sParaForPost.replace("@AUTH_CODE", sSetAuthCode);
            }
            else if (jrbRequestType3.isSelected()){
                // Check Eligible
                sSetAuthToken = txaAuthorization.getText();
                sSetTokenType = jtxtTokenType.getText();
                connHttpURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
            }
            else if (jrbRequestType4.isSelected()){
                // Payment QR Code
                // OLD Version MD5(MD5(“bitpayment2021”) + Date(20220127) + "RKH" + "1000.00" + "0001"))
                
                // Update 20220323
                // Authenticate :  Bearer Token
                // Password : fdffcd4ce6905bca6149914a0b987caf
                // Key = MD5( Password + Date(yyyymmdd) + HosCode (RKH) + Amount(1.00) + OrderNumber ) => Upper Case 

                sAuthorizeKey = jtxtAuthorizeKey.getText();
                sAuthorizeKeyMD5 = getMd5(sAuthorizeKey);
                sAuthorizeDate = jtxtAuthorizeDate.getText();
                sAuthorizeData = txaAuthorizeData.getText();
                sAllData = sAuthorizeKeyMD5 + sAuthorizeDate + sAuthorizeData;

                jtxtTokenType.setText("Bearer");
                sSetTokenType = jtxtTokenType.getText();
                        
                sSetAuthToken = getMd5(sAllData).toUpperCase();
                txaAuthorization.setText(sSetAuthToken);                
                
                connHttpURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
            }            
            else if (jrbRequestType5.isSelected()){
                // Send Normal Data with Authorization
                sSetAuthToken = txaAuthorization.getText();
                sSetTokenType = jtxtTokenType.getText();
                connHttpURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
            }
            else{
                // Send Normal Data WITHOUT Authorization
                sSetAuthToken = txaAuthorization.getText();
                sSetTokenType = jtxtTokenType.getText();
            }     
            
            txaPostData.setText(sParaForPost);
            byte[] postData = sParaForPost.getBytes(StandardCharsets.UTF_8);       // StandardCharsets.UTF_8
            postDataLength = postData.length;             
            connHttpURL.setRequestProperty("Content-Length", Integer.toString(postDataLength ));
            
            connHttpURL.setUseCaches(false);
            
            //SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            //connHttpsURL.setSSLSocketFactory(sslsocketfactory);
            
            try (DataOutputStream streamDO = new DataOutputStream(connHttpURL.getOutputStream())) {
                streamDO.write(postData);
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: streamDO - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: streamDO - " + ex.getMessage() + "\n");
            }        
            
            try (BufferedReader buffReader = new BufferedReader(new InputStreamReader(connHttpURL.getInputStream(),"utf-8"))) {
                contentSB = new StringBuilder();

                while ((sLine = buffReader.readLine()) != null) {
                    contentSB.append(sLine);
                    contentSB.append(System.lineSeparator());
                    txaResult.append(sLine + "\n");
                }
                sReturnResult = contentSB.toString();
                
                JSONObject jsonObj = null;
                try {
                    jsonObj = new JSONObject(sReturnResult);
                } 
                catch (JSONException e) {
                    e.printStackTrace();
                }                
                
                if (jrbRequestType0.isSelected()){
                    sReturnCode = jsonObj.getString("returnCode");
                    sReturnMessage = jsonObj.getString("returnMessage");
                    sEsbModule = jsonObj.getJSONObject("requestInfo").getJSONObject("serviceInfo").getString("esbModule");
                    sAuthCode = jsonObj.getString("authCode");
                    txaAuthCode.setText(sAuthCode);
                }
                else if (jrbRequestType1.isSelected()){
                    sReturnCode = jsonObj.getString("returnCode");
                    sReturnMessage = jsonObj.getString("returnMessage");
                    sEsbModule = jsonObj.getJSONObject("requestInfo").getJSONObject("serviceInfo").getString("esbModule");
                    sAccessToken = jsonObj.getJSONObject("tokenInfo").getString("accessToken");
                    sTokenType = jsonObj.getJSONObject("tokenInfo").getString("tokenType");                
                    jtxtTokenType.setText(sTokenType);
                    txaAuthorization.setText(sAccessToken);
                }
                else if (jrbRequestType3.isSelected()){
                    sReturnCode = jsonObj.getJSONObject("Result").getString("Code");
                    sReturnMessage = jsonObj.getJSONObject("Result").getString("Message");
                    sRefId = jsonObj.getJSONObject("Data").getString("RefId");
                    sTransactionNo = jsonObj.getJSONObject("Data").getString("TransactionNo");
                    jtxtTransactionNo.setText(sTransactionNo);
                }
                else{
                    
                }
                
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: Result - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: Result - " + ex.getMessage() + "\n");
            } finally {
                sReturnResult = "";
            }
            
        } catch (Exception ex) {
            Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
            txaResult.append("Error: Main - " + ex.getMessage() + "\n");
        } finally {
            connHttpURL.disconnect();
            //connHttpsURL.disconnect();
        }

        return sReturnResult;
        
    }    
    
    private String PostToWebWithSSL(){
        String sParaForPost;
        URL urlPost = null;
        StringBuilder contentSB = null;
        HttpsURLConnection connHttpsURL = null;
        String sLine;
        String sReturnResult = "";
        String sContentType;
        String sRequestMethod;
        String sSetAuthCode = "";
        String sSetTransactionNo = "";
        String sSetAuthToken = "";
        String sSetTokenType = "";
        int postDataLength;
        String sParameter;
        String sURL;
        String sDisplayMsg;
        String sEsbModule;
        String sAuthCode;
        String sAccessToken;
        String sTokenType;
        String sReturnCode;
        String sReturnMessage;
        String sRefId = "";
        String sTransactionNo = "";            
        
        postDataLength = 0;
        sURL = txaURL.getText();

        if (rbtContentType0.isSelected()){
            // application/x-www-form-urlencoded
            sContentType = "application/x-www-form-urlencoded";
        }
        else if (rbtContentType1.isSelected()){
            // application/json
            sContentType = "application/json";
        }
        else if (rbtContentType2.isSelected()){
            // multipart/form-data
            sContentType = "multipart/form-data";
        }
        else if (rbtContentType3.isSelected()){
            sContentType = txaContent.getText();
        }
        else{
            sContentType = "application/x-www-form-urlencoded";
        }
        
        if (rbtRequestMethodGet.isSelected()){
            sRequestMethod = "GET";
        }
        else{
            sRequestMethod = "POST";
        }
        
        try {
            
            try {
                urlPost = new URL(sURL);
            } catch (MalformedURLException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: urlPost - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: urlPost - " + ex.getMessage() + "\n");
            }
            
            try {
                //connHttpURL = (HttpURLConnection) urlPost.openConnection();
                //SSLFix.execute();
                connHttpsURL = (HttpsURLConnection) urlPost.openConnection();
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: connHttpURL - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: connHttpURL - " + ex.getMessage() + "\n");
            }

            connHttpsURL.setDoOutput(true);
            connHttpsURL.setInstanceFollowRedirects(false);
            try {
                connHttpsURL.setRequestMethod(sRequestMethod);
            } catch (ProtocolException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: POST - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: POST - " + ex.getMessage() + "\n");
            }
            connHttpsURL.setRequestProperty("Content-Type", sContentType + "; charset=utf-8");
            connHttpsURL.setRequestProperty("Accept-Charset", "utf-8");
            
            sParameter = txaParameter.getText();
            
        
            if (jrbRequestType0.isSelected()){
                // Get Auth Code
            }
            else if (jrbRequestType1.isSelected()){
                // Get Token
                // @AUTH_CODE
                sSetAuthCode = txaAuthCode.getText();
                sParameter = sParameter.replace("@AUTH_CODE", sSetAuthCode);
            }
            else if (jrbRequestType3.isSelected()){
                // Check Eligible
                sSetAuthToken = txaAuthorization.getText();
                sSetTokenType = jtxtTokenType.getText();
                connHttpsURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
            }
            else if (jrbRequestType4.isSelected()){
                // Payment QR Code
                String sAllData;
                String sAuthorizeKey;
                String sAuthorizeKeyMD5;
                String sAuthorizeDate;
                String sAuthorizeData;
                // MD5(MD5(“bitpayment2021”) + Date(20220127) + "RKH" + "1000.00" + "0001"))

                sAuthorizeKey = jtxtAuthorizeKey.getText();
                sAuthorizeKeyMD5 = getMd5(sAuthorizeKey);
                sAuthorizeDate = jtxtAuthorizeDate.getText();
                sAuthorizeData = txaAuthorizeData.getText();
                sAllData = sAuthorizeKeyMD5 + sAuthorizeDate + sAuthorizeData;

                jtxtTokenType.setText("Bearer");
                sSetTokenType = jtxtTokenType.getText();
                        
                sSetAuthToken = getMd5(sAllData).toUpperCase();
                txaAuthorization.setText(sSetAuthToken);                
                
                connHttpsURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
            }            
            else{
                // Send Normal Data
                sSetAuthToken = txaAuthorization.getText();
                sSetTokenType = jtxtTokenType.getText();
                connHttpsURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
                sSetTransactionNo = jtxtTransactionNo.getText();
                sParameter = sParameter.replace("@TRANSACTION_NO", sSetTransactionNo);
            }

            sParaForPost = sParameter.replace("\\", "");
            // sParaForPost = sParameter.replace("%", "%25");            
            txaPostData.setText(sParaForPost);
            byte[] postData = sParaForPost.getBytes(StandardCharsets.UTF_8);       // StandardCharsets.UTF_8
            postDataLength = postData.length;                
            connHttpsURL.setRequestProperty("Content-Length", Integer.toString(postDataLength ));       

            connHttpsURL.setUseCaches(false);
            
            //SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            //connHttpsURL.setSSLSocketFactory(sslsocketfactory);
            
            try (DataOutputStream streamDO = new DataOutputStream(connHttpsURL.getOutputStream())) {
                streamDO.write(postData);
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: streamDO - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: streamDO - " + ex.getMessage() + "\n");
            }        
            
            try (BufferedReader buffReader = new BufferedReader(new InputStreamReader(connHttpsURL.getInputStream()))) {
                contentSB = new StringBuilder();

                while ((sLine = buffReader.readLine()) != null) {
                    contentSB.append(sLine);
                    contentSB.append(System.lineSeparator());
                    txaResult.append(sLine + "\n");
                }
                sReturnResult = contentSB.toString();
                
                JSONObject jsonObj = null;
                try {
                    jsonObj = new JSONObject(sReturnResult);
                } 
                catch (JSONException e) {
                    e.printStackTrace();
                }                
                               
                if (jrbRequestType0.isSelected()){
                    // Get Auth Code
                    sReturnCode = jsonObj.getString("returnCode");
                    sReturnMessage = jsonObj.getString("returnMessage");
                    sEsbModule = jsonObj.getJSONObject("requestInfo").getJSONObject("serviceInfo").getString("esbModule");
                    sAuthCode = jsonObj.getString("authCode");
                    txaAuthCode.setText(sAuthCode);
                }
                else if (jrbRequestType1.isSelected()){
                    // Get Token
                    sReturnCode = jsonObj.getString("returnCode");
                    sReturnMessage = jsonObj.getString("returnMessage");
                    sEsbModule = jsonObj.getJSONObject("requestInfo").getJSONObject("serviceInfo").getString("esbModule");
                    sAccessToken = jsonObj.getJSONObject("tokenInfo").getString("accessToken");
                    sTokenType = jsonObj.getJSONObject("tokenInfo").getString("tokenType");                
                    jtxtTokenType.setText(sTokenType);
                    txaAuthorization.setText(sAccessToken);
                }
                else if (jrbRequestType3.isSelected()){
                    // Check Eligible
                    sReturnCode = jsonObj.getJSONObject("Result").getString("Code");
                    sReturnMessage = jsonObj.getJSONObject("Result").getString("Message");
                    sRefId = jsonObj.getJSONObject("Data").getString("RefId");
                    sTransactionNo = jsonObj.getJSONObject("Data").getString("TransactionNo");
                    jtxtTransactionNo.setText(sTransactionNo);
                }
                else if (jrbRequestType2.isSelected()){
                    // Normal Data
                }
                else if (jrbRequestType4.isSelected()){
                    // Payment QR Code
                }
                else if (jrbRequestType5.isSelected()){
                    // Normal Data(Auth)
                }
                else{
                    // Etc.
                }
                
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: Result - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: Result - " + ex.getMessage() + "\n");
            } finally {
                sReturnResult = "";
            }
        } catch (Exception ex) {
            Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
            txaResult.append("Error: Main - " + ex.getMessage() + "\n");
        } finally {
            //connHttpURL.disconnect();
            connHttpsURL.disconnect();
        }

        return sReturnResult;
        
    }        
    
    private String PostToWebWithSSLV2(){
        String sParaForPost;
        URL urlPost = null;
        StringBuilder contentSB = null;
        HttpsURLConnection connHttpsURL = null;
        String sLine;
        String sReturnResult = "";
        String sContentType;
        String sRequestMethod;
        String sSetAuthCode = "";
        String sSetTransactionNo = "";
        String sSetAuthToken = "";
        String sSetTokenType = "";
        int postDataLength;
        String sParameter;
        String sURL;
        String sDisplayMsg;
        String sEsbModule;
        String sAuthCode;
        String sAccessToken;
        String sTokenType;
        String sReturnCode;
        String sReturnMessage;
        String sRefId = "";
        String sTransactionNo = "";            
        
        postDataLength = 0;
        sURL = txaURL.getText();

        if (rbtContentType0.isSelected()){
            // application/x-www-form-urlencoded
            sContentType = "application/x-www-form-urlencoded";
        }
        else if (rbtContentType1.isSelected()){
            // application/json
            sContentType = "application/json";
        }
        else if (rbtContentType2.isSelected()){
            // multipart/form-data
            sContentType = "multipart/form-data";
        }
        else if (rbtContentType3.isSelected()){
            sContentType = txaContent.getText();
        }
        else{
            sContentType = "application/x-www-form-urlencoded";
        }
        
        if (rbtRequestMethodGet.isSelected()){
            sRequestMethod = "GET";
        }
        else{
            sRequestMethod = "POST";
        }
        
        try {
            
            try {
                urlPost = new URL(sURL);
            } catch (MalformedURLException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: urlPost - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: urlPost - " + ex.getMessage() + "\n");
            }
            
            try {
                //connHttpURL = (HttpURLConnection) urlPost.openConnection();
                SSLFix.execute();
                connHttpsURL = (HttpsURLConnection) urlPost.openConnection();
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: connHttpURL - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: connHttpURL - " + ex.getMessage() + "\n");
            }

            connHttpsURL.setDoOutput(true);
            connHttpsURL.setInstanceFollowRedirects(false);
            try {
                connHttpsURL.setRequestMethod(sRequestMethod);
            } catch (ProtocolException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: POST - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: POST - " + ex.getMessage() + "\n");
            }
            connHttpsURL.setRequestProperty("Content-Type", sContentType + "; charset=utf-8");
            connHttpsURL.setRequestProperty("Accept-Charset", "utf-8");
            
            sParameter = txaParameter.getText();
            
        
            if (jrbRequestType0.isSelected()){
                // Get Auth Code
            }
            else if (jrbRequestType1.isSelected()){
                // Get Token
                // @AUTH_CODE
                sSetAuthCode = txaAuthCode.getText();
                sParameter = sParameter.replace("@AUTH_CODE", sSetAuthCode);
            }
            else if (jrbRequestType3.isSelected()){
                // Check Eligible
                sSetAuthToken = txaAuthorization.getText();
                sSetTokenType = jtxtTokenType.getText();
                connHttpsURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
            }
            else if (jrbRequestType4.isSelected()){
                // Payment QR Code
                String sAllData;
                String sAuthorizeKey;
                String sAuthorizeKeyMD5;
                String sAuthorizeDate;
                String sAuthorizeData;
                // MD5(MD5(“bitpayment2021”) + Date(20220127) + "RKH" + "1000.00" + "0001"))

                sAuthorizeKey = jtxtAuthorizeKey.getText();
                sAuthorizeKeyMD5 = getMd5(sAuthorizeKey);
                sAuthorizeDate = jtxtAuthorizeDate.getText();
                sAuthorizeData = txaAuthorizeData.getText();
                sAllData = sAuthorizeKeyMD5 + sAuthorizeDate + sAuthorizeData;

                jtxtTokenType.setText("Bearer");
                sSetTokenType = jtxtTokenType.getText();
                        
                sSetAuthToken = getMd5(sAllData).toUpperCase();
                txaAuthorization.setText(sSetAuthToken);                
                
                connHttpsURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
            }            
            else{
                // Send Normal Data
                sSetAuthToken = txaAuthorization.getText();
                sSetTokenType = jtxtTokenType.getText();
                connHttpsURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
                sSetTransactionNo = jtxtTransactionNo.getText();
                sParameter = sParameter.replace("@TRANSACTION_NO", sSetTransactionNo);
            }

            sParaForPost = sParameter.replace("\\", "");
            // sParaForPost = sParameter.replace("%", "%25");     
            txaPostData.setText(sParaForPost);
            byte[] postData = sParaForPost.getBytes(StandardCharsets.UTF_8);       // StandardCharsets.UTF_8
            postDataLength = postData.length;                
            connHttpsURL.setRequestProperty("Content-Length", Integer.toString(postDataLength ));       

            connHttpsURL.setUseCaches(false);
            
            //SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            //connHttpsURL.setSSLSocketFactory(sslsocketfactory);
            
            try (DataOutputStream streamDO = new DataOutputStream(connHttpsURL.getOutputStream())) {
                streamDO.write(postData);
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: streamDO - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: streamDO - " + ex.getMessage() + "\n");
            }        
            
            try (BufferedReader buffReader = new BufferedReader(new InputStreamReader(connHttpsURL.getInputStream()))) {
                contentSB = new StringBuilder();

                while ((sLine = buffReader.readLine()) != null) {
                    contentSB.append(sLine);
                    contentSB.append(System.lineSeparator());
                    txaResult.append(sLine + "\n");
                }
                sReturnResult = contentSB.toString();
                
                JSONObject jsonObj = null;
                try {
                    jsonObj = new JSONObject(sReturnResult);
                } 
                catch (JSONException e) {
                    e.printStackTrace();
                }                
                
                if (jrbRequestType0.isSelected()){
                    sReturnCode = jsonObj.getString("returnCode");
                    sReturnMessage = jsonObj.getString("returnMessage");
                    sEsbModule = jsonObj.getJSONObject("requestInfo").getJSONObject("serviceInfo").getString("esbModule");
                    sAuthCode = jsonObj.getString("authCode");
                    txaAuthCode.setText(sAuthCode);
                }
                else if (jrbRequestType1.isSelected()){
                    sReturnCode = jsonObj.getString("returnCode");
                    sReturnMessage = jsonObj.getString("returnMessage");
                    sEsbModule = jsonObj.getJSONObject("requestInfo").getJSONObject("serviceInfo").getString("esbModule");
                    sAccessToken = jsonObj.getJSONObject("tokenInfo").getString("accessToken");
                    sTokenType = jsonObj.getJSONObject("tokenInfo").getString("tokenType");                
                    jtxtTokenType.setText(sTokenType);
                    txaAuthorization.setText(sAccessToken);
                }
                else if (jrbRequestType3.isSelected()){
                    sReturnCode = jsonObj.getJSONObject("Result").getString("Code");
                    sReturnMessage = jsonObj.getJSONObject("Result").getString("Message");
                    sRefId = jsonObj.getJSONObject("Data").getString("RefId");
                    sTransactionNo = jsonObj.getJSONObject("Data").getString("TransactionNo");
                    jtxtTransactionNo.setText(sTransactionNo);
                }
                else{
                    
                }
                
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: Result - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: Result - " + ex.getMessage() + "\n");
            } finally {
                sReturnResult = "";
            }
        } catch (Exception ex) {
            Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
            txaResult.append("Error: Main - " + ex.getMessage() + "\n");
        } finally {
            //connHttpURL.disconnect();
            connHttpsURL.disconnect();
        }

        return sReturnResult;
        
    }            

    private String PostToWebWithSSLV3(){
        String sParaForPost;
        URL urlPost = null;
        StringBuilder contentSB = null;
        HttpsURLConnection connHttpsURL = null;
        String sLine;
        String sReturnResult = "";
        String sContentType;
        String sRequestMethod;
        String sSetAuthCode = "";
        String sSetTransactionNo = "";
        String sSetAuthToken = "";
        String sSetTokenType = "";
        int postDataLength;
        String sParameter;
        String sURL;

        String sDisplayMsg;
        String sEsbModule;
        String sAuthCode;
        String sAccessToken;
        String sTokenType;
        String sReturnCode;
        String sReturnMessage;
        String sRefId = "";
        String sTransactionNo = "";            
        String sAllData;
        String sAuthorizeKey;
        String sAuthorizeKeyMD5;
        String sAuthorizeDate;
        String sAuthorizeData;  
        
        postDataLength = 0;
        sParameter = txaParameter.getText();
        sURL = txaURL.getText();

        if (rbtContentType0.isSelected()){
            // application/x-www-form-urlencoded
            sContentType = "application/x-www-form-urlencoded";
        }
        else if (rbtContentType1.isSelected()){
            // application/json
            sContentType = "application/json";
        }
        else if (rbtContentType2.isSelected()){
            // multipart/form-data
            sContentType = "multipart/form-data";
        }
        else if (rbtContentType3.isSelected()){
            sContentType = txaContent.getText();
        }
        else{
            sContentType = "application/x-www-form-urlencoded";
        }
        
        if (rbtRequestMethodGet.isSelected()){
            sRequestMethod = "GET";
        }
        else{
            sRequestMethod = "POST";
        }
        
        try {
            
            try {
                urlPost = new URL(sURL);
            } catch (MalformedURLException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: urlPost - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: urlPost - " + ex.getMessage() + "\n");
            }
            
            try {
                //connHttpURL = (HttpURLConnection) urlPost.openConnection();
                SSLFix.execute();
                connHttpsURL = (HttpsURLConnection) urlPost.openConnection();
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: connHttpURL - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: connHttpURL - " + ex.getMessage() + "\n");
            }

            connHttpsURL.setConnectTimeout(CONNECT_TIMEOUT);
            connHttpsURL.setReadTimeout(READ_TIMEOUT);            
            connHttpsURL.setDoInput(true);
            
            connHttpsURL.setDoOutput(true);
            connHttpsURL.setInstanceFollowRedirects(false);
            try {
                connHttpsURL.setRequestMethod(sRequestMethod);
            } catch (ProtocolException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: POST - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: POST - " + ex.getMessage() + "\n");
            }
            connHttpsURL.setRequestProperty("Content-Type", sContentType + "; charset=utf-8");
            connHttpsURL.setRequestProperty("Accept-Charset", "utf-8");

            sParaForPost = sParameter.replace("\\", "");
            // sParaForPost = sParameter.replace("%", "%25");     
        
            if (jrbRequestType0.isSelected()){
                // Get Auth Code - Use Only Parameter Data
            }
            else if (jrbRequestType1.isSelected()){
                // Get Token - Use Only Parameter Data
                // @AUTH_CODE
                sSetAuthCode = txaAuthCode.getText();
                sParaForPost = sParaForPost.replace("@AUTH_CODE", sSetAuthCode);
            }
            else if (jrbRequestType3.isSelected()){
                // Check Eligible
                sSetAuthToken = txaAuthorization.getText();
                sSetTokenType = jtxtTokenType.getText();
                connHttpsURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
            }
            else if (jrbRequestType4.isSelected()){
                // Payment QR Code
                // OLD Version MD5(MD5(“bitpayment2021”) + Date(20220127) + "RKH" + "1000.00" + "0001"))

                // Update 20220323
                // Authenticate :  Bearer Token
                // Password : fdffcd4ce6905bca6149914a0b987caf
                // Key = MD5( Password + Date(yyyymmdd) + HosCode (RKH) + Amount(1.00) + OrderNumber ) => Upper Case 

                sAuthorizeKey = jtxtAuthorizeKey.getText();
                sAuthorizeKeyMD5 = getMd5(sAuthorizeKey);
                sAuthorizeDate = jtxtAuthorizeDate.getText();
                sAuthorizeData = txaAuthorizeData.getText();
                sAllData = sAuthorizeKeyMD5 + sAuthorizeDate + sAuthorizeData;

                jtxtTokenType.setText("Bearer");
                sSetTokenType = jtxtTokenType.getText();
                        
                sSetAuthToken = getMd5(sAllData).toUpperCase();
                txaAuthorization.setText(sSetAuthToken);                
                
                connHttpsURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
            }            
            else if (jrbRequestType5.isSelected()){
                // Send Normal Data with Authorization
                sSetAuthToken = txaAuthorization.getText();
                sSetTokenType = jtxtTokenType.getText();
                connHttpsURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
            }
            else{
                // Send Normal Data WITHOUT Authorization
                sSetAuthToken = txaAuthorization.getText();
                sSetTokenType = jtxtTokenType.getText();
            }

            txaPostData.setText(sParaForPost);
            byte[] postData = sParaForPost.getBytes(StandardCharsets.UTF_8);       // StandardCharsets.UTF_8
            postDataLength = postData.length;                
            connHttpsURL.setRequestProperty("Content-Length", Integer.toString(postDataLength ));       

            connHttpsURL.setUseCaches(false);
            
            //SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            //connHttpsURL.setSSLSocketFactory(sslsocketfactory);
            
            try (DataOutputStream streamDO = new DataOutputStream(connHttpsURL.getOutputStream())) {
                streamDO.write(postData);
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: streamDO - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: streamDO - " + ex.getMessage() + "\n");
            }        
            
            try (BufferedReader buffReader = new BufferedReader(new InputStreamReader(connHttpsURL.getInputStream(),"utf-8"))) {
                contentSB = new StringBuilder();

                while ((sLine = buffReader.readLine()) != null) {
                    contentSB.append(sLine);
                    contentSB.append(System.lineSeparator());
                    txaResult.append(sLine + "\n");
                }
                sReturnResult = contentSB.toString();
                
                JSONObject jsonObj = null;
                try {
                    jsonObj = new JSONObject(sReturnResult);
                } 
                catch (JSONException e) {
                    e.printStackTrace();
                }                
                
                if (jrbRequestType0.isSelected()){
                    sReturnCode = jsonObj.getString("returnCode");
                    sReturnMessage = jsonObj.getString("returnMessage");
                    sEsbModule = jsonObj.getJSONObject("requestInfo").getJSONObject("serviceInfo").getString("esbModule");
                    sAuthCode = jsonObj.getString("authCode");
                    txaAuthCode.setText(sAuthCode);
                }
                else if (jrbRequestType1.isSelected()){
                    sReturnCode = jsonObj.getString("returnCode");
                    sReturnMessage = jsonObj.getString("returnMessage");
                    sEsbModule = jsonObj.getJSONObject("requestInfo").getJSONObject("serviceInfo").getString("esbModule");
                    sAccessToken = jsonObj.getJSONObject("tokenInfo").getString("accessToken");
                    sTokenType = jsonObj.getJSONObject("tokenInfo").getString("tokenType");                
                    jtxtTokenType.setText(sTokenType);
                    txaAuthorization.setText(sAccessToken);
                }
                else if (jrbRequestType3.isSelected()){
                    sReturnCode = jsonObj.getJSONObject("Result").getString("Code");
                    sReturnMessage = jsonObj.getJSONObject("Result").getString("Message");
                    sRefId = jsonObj.getJSONObject("Data").getString("RefId");
                    sTransactionNo = jsonObj.getJSONObject("Data").getString("TransactionNo");
                    jtxtTransactionNo.setText(sTransactionNo);
                }
                else{
                    
                }
                
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: Result - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: Result - " + ex.getMessage() + "\n");
            } finally {
                sReturnResult = "";
            }

        } catch (Exception ex) {
            Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
            txaResult.append("Error: Main - " + ex.getMessage() + "\n");
        } finally {
            //connHttpURL.disconnect();
            connHttpsURL.disconnect();
        }

        return sReturnResult;
        
    }
    
    private String PostDoctorQueueToWebOriginalV2(){
        String sParaForPost;
        URL urlPost = null;
        StringBuilder contentSB = null;
        HttpURLConnection connHttpURL = null;
        String sLine;
        String sReturnResult = "";
        String sContentType;
        String sRequestMethod;
        String sSetAuthCode = "";
        String sSetTransactionNo = "";
        String sSetAuthToken = "";
        String sSetTokenType = "";        
        int postDataLength;
        String sParameter;
        String sURL;

        String sDisplayMsg;
        String sEsbModule;
        String sAuthCode;
        String sAccessToken;
        String sTokenType;
        String sReturnCode;
        String sReturnMessage;
        String sRefId = "";
        String sTransactionNo = "";            
        String sAllData;
        String sAuthorizeKey;
        String sAuthorizeKeyMD5;
        String sAuthorizeDate;
        String sAuthorizeData;        
        
        postDataLength = 0;
        sParameter = txaParameter.getText();
        sURL = txaURL.getText();

        if (rbtContentType0.isSelected()){
            // application/x-www-form-urlencoded
            sContentType = "application/x-www-form-urlencoded";
        }
        else if (rbtContentType1.isSelected()){
            // application/json
            sContentType = "application/json";
        }
        else if (rbtContentType2.isSelected()){
            // multipart/form-data
            sContentType = "multipart/form-data";
        }
        else if (rbtContentType3.isSelected()){
            sContentType = txaContent.getText();
        }
        else{
            sContentType = "application/x-www-form-urlencoded";
        }
        
        if (rbtRequestMethodGet.isSelected()){
            sRequestMethod = "GET";
        }
        else{
            sRequestMethod = "POST";
        }           
        
        try {
            
            try {
                urlPost = new URL(sURL);
            } catch (MalformedURLException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: urlPost - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: urlPost - " + ex.getMessage() + "\n");
            }
            
            try {
                connHttpURL = (HttpURLConnection) urlPost.openConnection();
                // SSLFix.execute();
                // connHttpsURL = (HttpsURLConnection) urlPost.openConnection();
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: connHttpURL - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: connHttpURL - " + ex.getMessage() + "\n");
            }

            connHttpURL.setConnectTimeout(CONNECT_TIMEOUT);
            connHttpURL.setReadTimeout(READ_TIMEOUT);            
            connHttpURL.setDoInput(true);
            
            connHttpURL.setDoOutput(true);
            connHttpURL.setInstanceFollowRedirects(false);
            try {
                connHttpURL.setRequestMethod(sRequestMethod);
            } catch (ProtocolException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: POST - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: POST - " + ex.getMessage() + "\n");
            }
            connHttpURL.setRequestProperty("Content-Type", sContentType + "; charset=utf-8");
            connHttpURL.setRequestProperty("Accept-Charset", "utf-8");
            
            sParaForPost = sParameter.replace("\\", "");
            // sParaForPost = sParameter.replace("%", "%25");     
            
            if (jrbRequestType0.isSelected()){
                // Get Auth Code - Use Only Parameter Data
            }
            else if (jrbRequestType1.isSelected()){
                // Get Token - Use Only Parameter Data
                // @AUTH_CODE
                sSetAuthCode = txaAuthCode.getText();
                sParaForPost = sParaForPost.replace("@AUTH_CODE", sSetAuthCode);
            }
            else if (jrbRequestType3.isSelected()){
                // Check Eligible
                sSetAuthToken = txaAuthorization.getText();
                sSetTokenType = jtxtTokenType.getText();
                connHttpURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
            }
            else if (jrbRequestType4.isSelected()){
                // Payment QR Code
                // OLD Version MD5(MD5(“bitpayment2021”) + Date(20220127) + "RKH" + "1000.00" + "0001"))
                
                // Update 20220323
                // Authenticate :  Bearer Token
                // Password : fdffcd4ce6905bca6149914a0b987caf
                // Key = MD5( Password + Date(yyyymmdd) + HosCode (RKH) + Amount(1.00) + OrderNumber ) => Upper Case 

                sAuthorizeKey = jtxtAuthorizeKey.getText();
                sAuthorizeKeyMD5 = getMd5(sAuthorizeKey);
                sAuthorizeDate = jtxtAuthorizeDate.getText();
                sAuthorizeData = txaAuthorizeData.getText();
                sAllData = sAuthorizeKeyMD5 + sAuthorizeDate + sAuthorizeData;

                jtxtTokenType.setText("Bearer");
                sSetTokenType = jtxtTokenType.getText();
                        
                sSetAuthToken = getMd5(sAllData).toUpperCase();
                txaAuthorization.setText(sSetAuthToken);                
                
                connHttpURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
            }            
            else if (jrbRequestType5.isSelected()){
                // Send Normal Data with Authorization
                sSetAuthToken = txaAuthorization.getText();
                sSetTokenType = jtxtTokenType.getText();
                connHttpURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
            }
            else{
                // Send Normal Data WITHOUT Authorization
                sSetAuthToken = txaAuthorization.getText();
                sSetTokenType = jtxtTokenType.getText();
            }     
            
            txaPostData.setText(sParaForPost);
            byte[] postData = sParaForPost.getBytes(StandardCharsets.UTF_8);       // StandardCharsets.UTF_8
            postDataLength = postData.length;             
            connHttpURL.setRequestProperty("Content-Length", Integer.toString(postDataLength ));
            
            connHttpURL.setUseCaches(false);
            
            //SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            //connHttpsURL.setSSLSocketFactory(sslsocketfactory);
            
            try (DataOutputStream streamDO = new DataOutputStream(connHttpURL.getOutputStream())) {
                streamDO.write(postData);
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: streamDO - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: streamDO - " + ex.getMessage() + "\n");
            }        
            
            try (BufferedReader buffReader = new BufferedReader(new InputStreamReader(connHttpURL.getInputStream(),"utf-8"))) {
                contentSB = new StringBuilder();

                while ((sLine = buffReader.readLine()) != null) {
                    contentSB.append(sLine);
                    contentSB.append(System.lineSeparator());
                    txaResult.append(sLine + "\n");
                }
                sReturnResult = contentSB.toString();
                
                JSONObject jsonObj = null;
                try {
                    jsonObj = new JSONObject(sReturnResult);
                } 
                catch (JSONException e) {
                    e.printStackTrace();
                }                
                
                if (jrbRequestType0.isSelected()){
                    sReturnCode = jsonObj.getString("returnCode");
                    sReturnMessage = jsonObj.getString("returnMessage");
                    sEsbModule = jsonObj.getJSONObject("requestInfo").getJSONObject("serviceInfo").getString("esbModule");
                    sAuthCode = jsonObj.getString("authCode");
                    txaAuthCode.setText(sAuthCode);
                }
                else if (jrbRequestType1.isSelected()){
                    sReturnCode = jsonObj.getString("returnCode");
                    sReturnMessage = jsonObj.getString("returnMessage");
                    sEsbModule = jsonObj.getJSONObject("requestInfo").getJSONObject("serviceInfo").getString("esbModule");
                    sAccessToken = jsonObj.getJSONObject("tokenInfo").getString("accessToken");
                    sTokenType = jsonObj.getJSONObject("tokenInfo").getString("tokenType");                
                    jtxtTokenType.setText(sTokenType);
                    txaAuthorization.setText(sAccessToken);
                }
                else if (jrbRequestType3.isSelected()){
                    sReturnCode = jsonObj.getJSONObject("Result").getString("Code");
                    sReturnMessage = jsonObj.getJSONObject("Result").getString("Message");
                    sRefId = jsonObj.getJSONObject("Data").getString("RefId");
                    sTransactionNo = jsonObj.getJSONObject("Data").getString("TransactionNo");
                    jtxtTransactionNo.setText(sTransactionNo);
                }
                else{
                    
                }
                
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: Result - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: Result - " + ex.getMessage() + "\n");
            } finally {
                sReturnResult = "";
            }
            
        } catch (Exception ex) {
            Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
            txaResult.append("Error: Main - " + ex.getMessage() + "\n");
        } finally {
            connHttpURL.disconnect();
            //connHttpsURL.disconnect();
        }

        return sReturnResult;
        
    }
    
    private String PostDoctorQueueToWebOriginal(){
        String sParaForPost;
        URL urlPost = null;
        StringBuilder contentSB = null;
        HttpURLConnection connHttpURL = null;
        String sLine;
        String sReturnResult = "";
        String sContentType;
        String sRequestMethod;
        String sSetAuthToken = "";
        String sSetTokenType = "";        
        int postDataLength;
        String sParameter;
        String sURL;

        String sAllData;
        String sAuthorizeKey;
        String sAuthorizeKeyMD5;
        String sAuthorizeDate;
        String sAuthorizeData;        
        
        postDataLength = 0;
        sParameter = txaParameter.getText();
        sURL = txaURL.getText();

        if (rbtContentType0.isSelected()){
            // application/x-www-form-urlencoded
            sContentType = "application/x-www-form-urlencoded";
        }
        else if (rbtContentType1.isSelected()){
            // application/json
            sContentType = "application/json";
        }
        else if (rbtContentType2.isSelected()){
            // multipart/form-data
            sContentType = "multipart/form-data";
        }
        else if (rbtContentType3.isSelected()){
            sContentType = txaContent.getText();
        }
        else{
            sContentType = "application/x-www-form-urlencoded";
        }
        
        if (rbtRequestMethodGet.isSelected()){
            sRequestMethod = "GET";
        }
        else{
            sRequestMethod = "POST";
        }           
        
        try {
            
            try {
                urlPost = new URL(sURL);
            } catch (MalformedURLException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: urlPost - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: urlPost - " + ex.getMessage() + "\n");
            }
            
            try {
                connHttpURL = (HttpURLConnection) urlPost.openConnection();
                // SSLFix.execute();
                // connHttpsURL = (HttpsURLConnection) urlPost.openConnection();
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: connHttpURL - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: connHttpURL - " + ex.getMessage() + "\n");
            }

            connHttpURL.setConnectTimeout(CONNECT_TIMEOUT);
            connHttpURL.setReadTimeout(READ_TIMEOUT);            
            connHttpURL.setDoInput(true);
            
            connHttpURL.setDoOutput(true);
            connHttpURL.setInstanceFollowRedirects(false);
            try {
                connHttpURL.setRequestMethod(sRequestMethod);
            } catch (ProtocolException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: POST - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: POST - " + ex.getMessage() + "\n");
            }
            connHttpURL.setRequestProperty("Content-Type", sContentType + "; charset=utf-8");
            connHttpURL.setRequestProperty("Accept-Charset", "utf-8");
            
            sParaForPost = sParameter.replace("\\", "");
            // sParaForPost = sParameter.replace("%", "%25");     
            
            if (jrbRequestType1.isSelected()){
                // Replace Token @AUTH_CODE
                sParaForPost = sParaForPost.replace("@AUTH_CODE", sParameter);
            }            
            
            txaPostData.setText(sParaForPost);
            byte[] postData = sParaForPost.getBytes(StandardCharsets.UTF_8);       // StandardCharsets.UTF_8
            postDataLength = postData.length;             
            connHttpURL.setRequestProperty("Content-Length", Integer.toString(postDataLength ));

            /*
            for (byte myByte: postData) {
                //do something with myByte
                System.out.println(myByte);
            }


            for (int i=0;i<postData.length;i++) {
                //do something with mFFTBytes[i]
                System.out.println(postData[i]);
            }            
            */
            
            if (jrbRequestType0.isSelected()){
                // Get Auth Code - Use Only Parameter Data
            }
            else if (jrbRequestType1.isSelected()){
                // Get Token - Use Only Parameter Data
                // @AUTH_CODE
            }
            else if (jrbRequestType3.isSelected()){
                // Check Eligible
                sSetAuthToken = txaAuthorization.getText();
                sSetTokenType = jtxtTokenType.getText();
                connHttpURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
            }
            else if (jrbRequestType4.isSelected()){
                // Payment QR Code
                // OLD Version MD5(MD5(“bitpayment2021”) + Date(20220127) + "RKH" + "1000.00" + "0001"))
                
                // Update 20220323
                // Authenticate :  Bearer Token
                // Password : fdffcd4ce6905bca6149914a0b987caf
                // Key = MD5( Password + Date(yyyymmdd) + HosCode (RKH) + Amount(1.00) + OrderNumber ) => Upper Case 
                
                sAuthorizeKey = jtxtAuthorizeKey.getText();
                sAuthorizeKeyMD5 = getMd5(sAuthorizeKey);
                sAuthorizeDate = jtxtAuthorizeDate.getText();
                sAuthorizeData = txaAuthorizeData.getText();
                sAllData = sAuthorizeKeyMD5 + sAuthorizeDate + sAuthorizeData;

                jtxtTokenType.setText("Bearer");
                sSetTokenType = jtxtTokenType.getText();
                        
                sSetAuthToken = getMd5(sAllData).toUpperCase();
                txaAuthorization.setText(sSetAuthToken);                
                
                connHttpURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
            }            
            else if (jrbRequestType5.isSelected()){
                // Send Normal Data with Authorization
                sSetAuthToken = txaAuthorization.getText();
                sSetTokenType = jtxtTokenType.getText();
                connHttpURL.setRequestProperty("Authorization", sSetTokenType + " " + sSetAuthToken);
            }
            else{
                // Send Normal Data WITHOUT Authorization
                sSetAuthToken = txaAuthorization.getText();
                sSetTokenType = jtxtTokenType.getText();
            }
            
            connHttpURL.setUseCaches(false);
            
            //SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            //connHttpsURL.setSSLSocketFactory(sslsocketfactory);
            
            try (DataOutputStream streamDO = new DataOutputStream(connHttpURL.getOutputStream())) {
                streamDO.write(postData);
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: streamDO - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: streamDO - " + ex.getMessage() + "\n");
            }        
            
            try (BufferedReader buffReader = new BufferedReader(new InputStreamReader(connHttpURL.getInputStream(),"utf-8"))) {
                contentSB = new StringBuilder();

                while ((sLine = buffReader.readLine()) != null) {
                    contentSB.append(sLine);
                    contentSB.append(System.lineSeparator());
                    txaResult.append(sLine + "\n");
                }
                sReturnResult = contentSB.toString();
            } catch (IOException ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: Result - " + ex.getMessage() + "\n");
            } catch (Exception ex) {
                Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
                txaResult.append("Error: Result - " + ex.getMessage() + "\n");
            } finally {
                sReturnResult = "";
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
            txaResult.append("Error: Main - " + ex.getMessage() + "\n");
        } finally {
            connHttpURL.disconnect();
            //connHttpsURL.disconnect();
        }

        return sReturnResult;
        
    }        
    
    public static String getMd5(String input){
        try {
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
  
            // digest() method is called to calculate message digest
            //  of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());
  
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
  
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } 
  
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }        
    
    public boolean isJsonFormatValid(String jsonString) {
        try {
            new JSONObject(jsonString);
            return true;
        } catch (JSONException ex) {
            Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String sPatientID;
        String sType;
        String sTitle;
        String sDescription;
        String sImage;
        String sDataDate;
        String sGroupHN;
        String sContentType;
        String sRequestMethod;
        String sDoctorID;
        String sStationCode;
        String sQueueNumber;
        String sStationNameTH;
        String sStationNameEN;
        String urlParameters;
        
        // https://httpbin.org/post         https://rkh-srvapp-ramgroup.southeastasia.cloudapp.azure.com:5905/api/upload/rmdr
        // http://10.100.212.184:8080/InterfaceServer/PublishReminder
        String sParameter = txaParameter.getText();
        String sURL = txaURL.getText();

        /*
            http://httpbin.org/post
            application/x-www-form-urlencoded
            param3=345&param4=ert        
        
            https://httpbin.org/post
            application/x-www-form-urlencoded
            name=John Doe&occupation=gardener
        
            application/json; charset=UTF-8
        */
        
        // name=Jack&occupation=programmer
        // sHTMLActivitiesTemplate = sHTMLActivitiesTemplate.replace("@NRS_TEMP", sHTMLSubTagNUR);
        // @JSON_HEADER&@JSON_PATIENT_ID&@JSON_TYPE&@JSON_TITLE&@JSON_DESC&@JSON_IMAGE&@JSON_DATE&@JSON_GROUP
        // @JSON_UPD_DTTM   yyyy-MM-DD	hh:mm:ss.sss  2019-01-01 10:00:00.000
        // [{@JSON_DOC_ID,@JSON_CURR_POS,@JSON_UPD_DTTM}]
        //// [{@JSON_DOC_ID,@JSON_DOC_HOURS,@JSON_USER_HN,@JSON_USER_POS,@JSON_STN_CD,@JSON_STN_NAME_TH,@JSON_STN_NAME_EN,@JSON_UPD_DTTM}]
        // [{@JSON_DOC_ID,@JSON_DOC_HOURS,@JSON_USER_HN,@JSON_USER_POS,@JSON_STN_CD,@JSON_STN_NAME_TH,@JSON_STN_NAME_EN,@JSON_UPD_TYPE,@JSON_UPD_DTTM}]
        // application/x-www-form-urlencoded
        if (rbtContentType0.isSelected()){
            // application/x-www-form-urlencoded
            sContentType = "application/x-www-form-urlencoded";
        }
        else if (rbtContentType1.isSelected()){
            // application/json
            sContentType = "application/json";
        }
        else if (rbtContentType2.isSelected()){
            // multipart/form-data
            sContentType = "multipart/form-data";
        }
        else if (rbtContentType3.isSelected()){
            sContentType = txaContent.getText();
        }
        else{
            sContentType = "application/x-www-form-urlencoded";
        }
        
        if (rbtRequestMethodGet.isSelected()){
            sRequestMethod = "GET";
        }
        else{
            sRequestMethod = "POST";
        }

        urlParameters = sParameter;

        txaPostData.setText(urlParameters);
        /*
        try {
            urlParameters = URLEncoder.encode(urlParameters, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PostWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        txaPostDataEncode.setText(urlParameters);

        
        
        byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);       // StandardCharsets.UTF_8

        int postDataLength = postData.length;

        try {

            URL myurl = null;
            try {
                myurl = new URL(sURL);
            } catch (MalformedURLException ex) {
                Logger.getLogger(PostWeb.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                con = (HttpURLConnection) myurl.openConnection();
                //HttpURLConnection con = (HttpURLConnection) myurl.openConnection();
            } catch (IOException ex) {
                Logger.getLogger(PostWeb.class.getName()).log(Level.SEVERE, null, ex);
            }

            con.setConnectTimeout(5000);
            con.setDoInput(true);
            
            con.setDoOutput(true);
            con.setInstanceFollowRedirects(false);
            try {
                con.setRequestMethod(sRequestMethod);       // POST  GET
            } catch (ProtocolException ex) {
                Logger.getLogger(PostWeb.class.getName()).log(Level.SEVERE, null, ex);
            }
            con.setRequestProperty("Content-Type", sContentType + "; charset=UTF-8");
            con.setRequestProperty("Accept-Charset", "UTF-8");
            con.setRequestProperty("Content-Length", Integer.toString(postDataLength ));
            con.setUseCaches(false);
            //con.setRequestProperty("User-Agent", "Java client");

            try (DataOutputStream wr = new DataOutputStream(con.getOutputStream())) {
                wr.write(postData);
            } catch (IOException ex) {
                Logger.getLogger(PostWeb.class.getName()).log(Level.SEVERE, null, ex);
            }

            StringBuilder content = null;

            try (BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()))) {

            String line;
            content = new StringBuilder();

            while ((line = in.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }
        } catch (IOException ex) {
            Logger.getLogger(PostWeb.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sReturnResult = "";
        sReturnResult = content.toString();

        txaResult.append(sReturnResult);

        // System.out.println(content.toString());

        } finally {

            con.disconnect();
        }

    }//GEN-LAST:event_jButton1ActionPerformed
  
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // Source code from https://blog.cpming.top/p/httpurlconnection-post-raw
        String sPostData = "";
        boolean bIsJsonFormatValid = false;
        
        sPostData = txaParameter.getText();
        bIsJsonFormatValid = isJsonFormatValid(sPostData);
        
        if(bIsJsonFormatValid == true){
            // With Out SSL
            SendDataToAPIMain(false);
        }
        else{
            Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, "Invalid JSON format");
            txaResult.append("Error: POST - Invalid JSON format\n");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lstArrJsonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstArrJsonMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_lstArrJsonMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String sPostData = "";
        boolean bIsJsonFormatValid = false;
        
        sPostData = txaParameter.getText();
        bIsJsonFormatValid = isJsonFormatValid(sPostData);
        
        if(bIsJsonFormatValid == true){
            // With SSL
            SendDataToAPIMain(true);
        }
        else{
            Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, "Invalid JSON format");
            txaResult.append("Error: POST - Invalid JSON format\n");
        }        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Source code from https://blog.cpming.top/p/httpurlconnection-post-raw
        String sPatientname = "";
        String sHN = "";
        String sAN = "patientname";
        String sStartdate = "";
        String sDepartmentuid = "";
        String sDepartmentname = "";
        String sDrcode = "";
        String sDrname = "";
        boolean bStatus;
        boolean bCheckorder;
        String sDisplayMsg;
        String sURL;
        String sParameter;
        String sContentType;       
        String sRequestMethod;
        
        sParameter = txaParameter.getText();
        sURL = txaURL.getText();

        if (rbtContentType0.isSelected()){
            // application/x-www-form-urlencoded
            sContentType = "application/x-www-form-urlencoded";
        }
        else if (rbtContentType1.isSelected()){
            // application/json
            sContentType = "application/json";
        }
        else if (rbtContentType2.isSelected()){
            // multipart/form-data
            sContentType = "multipart/form-data";
        }
        else if (rbtContentType3.isSelected()){
            sContentType = txaContent.getText();
        }
        else{
            sContentType = "application/x-www-form-urlencoded";
        }
        
        if (rbtRequestMethodGet.isSelected()){
            sRequestMethod = "GET";
        }
        else{
            sRequestMethod = "POST";
        }        
        
        // "http://159.138.244.73:7222/centrix_api_kdms/afterregistration/"
        // "
        
        try {
            HttpPostRaw post = new HttpPostRaw(sURL, "utf-8");
            // String json = "{\"id\":\"288285\",\"value\":\"test\"}";
            //String json = "{\"orguid\": \"59e865c8ab5f11532bab0537\", \"visitdate\": \"2021-12-27T17:00:00.00Z\"}";
            String json = sParameter;
            post.setPostData(json);
            post.addHeader("Content-Type", sContentType);
            post.setRequestMethod(sRequestMethod);
            String out = post.finish();
            System.out.println(out);
            txaResult.append(out);
            // String out2;
            // out2 = out.substring(8, out.length() - 1);
            txaResult.append("Return Result - " + out + "\n");
            
            
            JSONArray jsonArr = new JSONArray(out);
            DefaultListModel listModel = new DefaultListModel();
            for (int i = 0; i < jsonArr.length(); i++){
                JSONObject jsonObj = jsonArr.getJSONObject(i);

                listModel.addElement(jsonObj);
                System.out.println(jsonObj);
                
                try{
                    sPatientname = "Patient Name : " + jsonObj.getString("patientname");
                }
                catch (Exception e) {
                    sPatientname = "Patient Name : (NULL)";
                }
                try{
                    sHN = "HN : " + jsonObj.getString("HN");
                }
                catch (Exception e) {
                    sHN = "HN : (NULL)";
                }
                try{
                    sAN = "VN/AN : " + jsonObj.getString("AN");
                }
                catch (Exception e) {
                    sAN = "VN/AN : (NULL)";
                }
                try{
                    sStartdate = "Start Date : " + jsonObj.getString("startdate");
                }
                catch (Exception e) {
                    sStartdate = "Start Date : (NULL)";
                }
                try{
                    sDepartmentuid = "Department ID : " + jsonObj.getString("departmentuid");
                }
                catch (Exception e) {
                    sDepartmentuid = "Department ID : (NULL)";
                }
                try{
                    sDepartmentname = "Department Name : " + jsonObj.getString("departmentname");
                }
                catch (Exception e) {
                    sDepartmentname = "Department Name : (NULL)";
                }
                try{
                    sDrcode = "Doctor Code : " + jsonObj.getString("drcode");
                }
                catch (Exception e) {
                    sDrcode = "Doctor Code : (NULL)";
                }
                try{
                    sDrname = "Doctor Name : " + jsonObj.getString("drname");
                }
                catch (Exception e) {
                    sDrname = "Doctor Name : (NULL)";
                }                
                bStatus = jsonObj.getBoolean("status");
                bCheckorder = jsonObj.getBoolean("checkorder");
                sDisplayMsg = sHN + ", " + sPatientname + ", " + sAN + ", " + sStartdate + ", " + sDepartmentuid + ", " + sDepartmentname + ", " + sDrcode + ", " + sDrname + "\n\n";
                
                txaPostDataEncode.append(sDisplayMsg);

            }
            lstArrJson.setModel(listModel);
            
        
        } catch (Exception e) {
            e.printStackTrace();
        }
                
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        txaResult.append(PostToWebWithSSL());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jrbRequestType2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbRequestType2ActionPerformed
        // TODO add your handling code here:
        // Normal Data
        tabRequestDetail.setSelectedIndex(0);
    }//GEN-LAST:event_jrbRequestType2ActionPerformed

    private void jrbRequestType5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbRequestType5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbRequestType5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String sJsonData = "";
        String sReturnData = "";
        
        sJsonData = txaParameter.getText();
        try {
            sReturnData = JsonParser(sJsonData);
        } catch (JSONException ex) {
            Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
        }
        txaResult.setText(sReturnData);
    }//GEN-LAST:event_jButton6ActionPerformed
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String sBase64;
        
        sBase64 = txaResult.getText();
        byte[] decodedBytes = Base64.getDecoder().decode(sBase64);
        try {        
            Files.write(Paths.get("C:\\Temp\\ClaimDoc_20220627.jpg"), decodedBytes);
        } catch (IOException ex) {
            Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
           BufferedImage img = ImageIO.read(new File("C:\\Temp\\ClaimDoc_20220627.jpg"));
           ImageIcon icon = new ImageIcon(img);
           JLabel label = new JLabel(icon);
           JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
           e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String sImagePath;
        String sBase64;
        String sFileFype;
        
        // sImagePath = "C:\\Temp\\ClaimDoc2.jpg";
        /*
        File fImageToBase64 =  new File("C:\\Temp\\ClaimDoc.jpg");
        try {
            //sBase64 = imageEncoder(sImagePath);
            sBase64 = imageEncoderWithFile(fImageToBase64);
            txaResult.setText(sBase64);
            sFileFype = extractMimeType(sBase64);
            txaPostDataEncode.setText(sFileFype);
        } catch (IOException ex) {
            Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        File image = new File("C:\\Temp\\ClaimDoc.jpg");
        File newImage = new File("C:\\Temp\\ClaimDoc_20220627.jpg");

        // Encoded as Base64 String
        //byte[] bytes = FileUtils.readFileToByteArray(image);
        // byte[] bytes = new byte[(int)image.length()];
        // String base64 = new String(Base64.getEncoder().encode(bytes), StandardCharsets.UTF_8);
        byte[] bytes = new byte[(int)image.length()];
        bytes = toBytes(image);
        String base64;
        base64 = toBase64(bytes);
        System.out.println(base64);
        // Base64 Save as Picture
        //bytes = Base64.getDecoder().decode(base64);
        //FileUtils.writeByteArrayToFile(newImage, bytes);        
        
        byte[] decodedBytes = Base64.getDecoder().decode(base64);
        try {        
            Files.write(Paths.get("C:\\Temp\\ClaimDoc_20220627.jpg"), decodedBytes);
        } catch (IOException ex) {
            Logger.getLogger(PostWebManualV2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
           BufferedImage img = ImageIO.read(new File("C:\\Temp\\ClaimDoc_20220627.jpg"));
           ImageIcon icon = new ImageIcon(img);
           JLabel label = new JLabel(icon);
           JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
           e.printStackTrace();
        }        
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        RbtEncryption RbtEn = new RbtEncryption();
        
        String sCryptoType;
        
        
        String sKey = "";
        String sData = "";
        String sCipher = "";
        String sEncryptData = "";
        String encryptedval = "";
        String decryptedval = "";
        
        sKey = txaAESKey.getText().trim();
        sCipher = txtAESCipher.getText().trim();
        
        if (rbtDecrypte.isSelected()){
            sCryptoType = "D";
            encryptedval = txaPostDataEncode.getText().trim();
            // decryptedval = decryptV2(encryptedval, sKey, sCipher);
            decryptedval = RbtEn.RbtAESDecrypt(encryptedval, sKey, sCipher);
            txaResult.setText(decryptedval);
        }
        else{
            sCryptoType = "E";
            sData = txaParameter.getText().trim();
            // encryptedval = encryptV2(sData, sKey, sCipher);
            encryptedval = RbtEn.RbtAESEncrypt(sData, sKey, sCipher);
            txaPostDataEncode.setText(encryptedval);
        }        
        
        
        
        
        //System.out.println(encryptV2(data, key));
        //System.out.println(decryptV2(encryptV2(data, key), key));
        
        //System.out.println("Original value: " + data);  
        //System.out.println("Encrypted value: " + encryptedval);  
        //System.out.println("Decrypted value: " + decryptedval);         
        
        /* Message to be encrypted. */  
        //String originalval = "22615";       // AES Encryption
        /* Call the encrypt() method and store result of encryption. */  
        //String encryptedval = encrypt(originalval);  
        /* Call the decrypt() method and store result of decryption. */  
        //String decryptedval = decrypt(encryptedval);  
        /* Display the original message, encrypted message and decrypted message on the console. */  
        //System.out.println("Original value: " + originalval);  
        //System.out.println("Encrypted value: " + encryptedval);  
        //System.out.println("Decrypted value: " + decryptedval);  
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jrbRequestType4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbRequestType4ActionPerformed
        // TODO add your handling code here:
        // Payment QR
        tabRequestDetail.setSelectedIndex(9);
    }//GEN-LAST:event_jrbRequestType4ActionPerformed

    private void jrbRequestType6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbRequestType6ActionPerformed
        // TODO add your handling code here:
        tabRequestDetail.setSelectedIndex(8);
    }//GEN-LAST:event_jrbRequestType6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        
        // "DoctorName"="@DOCTOR_FIRST_NAME_ENCRYPT"
        // @DOCTOR_FIRST_NAME
        // @DOCTOR_FIRST_NAME_ENCRYPT
        String sPrepareData = "";
        String sNonEncryptData = "";
        String sEncryptData = "";
        String sNewPrepareData = "";
        String sReplaceData = "";
        
        sReplaceData = txtAESReplace.getText().trim();
        sPrepareData = txaContent.getText().trim();
        sNonEncryptData = txaParameter.getText().trim();
        sEncryptData = txaPostDataEncode.getText().trim();
        sNewPrepareData = ReplaceJsonData(sReplaceData, sPrepareData, sNonEncryptData, sEncryptData);
        txaPostData.append("NewPrepareData = " + sNewPrepareData + "\n");
        txaPostData.append("ReplaceData = " + sReplaceData + "\n");
        txaPostData.append("PrepareData = " + sPrepareData + "\n");
        txaPostData.append("NonEncryptData = " + sNonEncryptData + "\n");
        txaPostData.append("EncryptData = " + sEncryptData + "\n");
        
    }//GEN-LAST:event_jButton10ActionPerformed
   
    public static String ReplaceJsonData(String sPrmFind, String sPrmPrepareData, String sPrmNonEncryptData, String sPrmEncryptData){
        String sReplaceData = "";

        if(sPrmFind.contains("_ENCRYPT")){
            sReplaceData = sPrmPrepareData.replace(sPrmFind, sPrmEncryptData);
        }
        else{
            sReplaceData = sPrmPrepareData.replace(sPrmFind, sPrmNonEncryptData);
        }
        
        return sReplaceData;  
    }    
    
    public static String encryptV2(String input, String key, String sPrmCipher) {
            byte[] crypted = null;
            try {
                SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
                // Default - AES/ECB/PKCS5Padding
                Cipher cipher = Cipher.getInstance(sPrmCipher);
                cipher.init(Cipher.ENCRYPT_MODE, skey);
                crypted = cipher.doFinal(input.getBytes());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            java.util.Base64.Encoder encoder = java.util.Base64.getEncoder();

            return new String(encoder.encodeToString(crypted));
    }

    public static String decryptV2(String input, String key, String sPrmCipher) {
            byte[] output = null;
            try {
                java.util.Base64.Decoder decoder = java.util.Base64.getDecoder();
                SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
                // Default - AES/ECB/PKCS5Padding
                Cipher cipher = Cipher.getInstance(sPrmCipher);
                cipher.init(Cipher.DECRYPT_MODE, skey);
                output = cipher.doFinal(decoder.decode(input));
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            return new String(output);
    }    
    
    /* Private variable declaration */  
    private static final String SECRET_KEY = "iSFaPXrcHWKaFOwSxMkl4qKaZRThSCak";  
    private static final String SALTVALUE = "bhcsi264";      
    
    /* Encryption Method */  
    public static String encrypt(String strToEncrypt){  
        try{  
            /* Declare a byte array. */  
            byte[] iv = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};  
            IvParameterSpec ivspec = new IvParameterSpec(iv);        
            /* Create factory for secret keys. */  
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");  
            /* PBEKeySpec class implements KeySpec interface. */  
            KeySpec spec = new PBEKeySpec(SECRET_KEY.toCharArray(), SALTVALUE.getBytes(), 65536, 256);  
            SecretKey tmp = factory.generateSecret(spec);  
            SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");  
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");  
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivspec);  
            /* Retruns encrypted value. */  
            return Base64.getEncoder()  
            .encodeToString(cipher.doFinal(strToEncrypt.getBytes(StandardCharsets.UTF_8)));  
        }   
        catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e)   
        {  
            System.out.println("Error occured during encryption: " + e.toString());  
        }  
        return null;  
    }

    /* Decryption Method */  
    public static String decrypt(String strToDecrypt){  
        try{  
            /* Declare a byte array. */  
            byte[] iv = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};  
            IvParameterSpec ivspec = new IvParameterSpec(iv);  
            /* Create factory for secret keys. */  
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");  
            /* PBEKeySpec class implements KeySpec interface. */  
            KeySpec spec = new PBEKeySpec(SECRET_KEY.toCharArray(), SALTVALUE.getBytes(), 65536, 256);  
            SecretKey tmp = factory.generateSecret(spec);  
            SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");  
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");  
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivspec);  
            /* Retruns decrypted value. */  
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));  
        }   
        catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e)   
        {  
            System.out.println("Error occured during decryption: " + e.toString());  
        }  
        return null;  
    }      
    
    public static byte[] toBytes(File image) {
        try (FileInputStream input = new FileInputStream(image)) {
            // The available() of InputStream returns the length of data that the InputStream can read at one time without blocking.
            // byte[] imageBytes = new byte[input.available()];
            // input.read(imageBytes);

            byte[] bytes = new byte[(int)image.length()];

            return bytes;
        } catch (IOException e) {
            return null;
        }
    }

    public static String toBase64(byte[] bytes) {
        return bytesEncode2Base64(bytes);
    }
    
    /**
     * Convert Picture to String of base64
     * 
     * @param image
     *            Picture file to process
     * @return base64 string converted from picture file
     */
    public static String toBase64(File image) {
        return toBase64(image, false);
    }
    
    /**
     * Convert the picture to a string of base64.If the value of <code>appendDataURLScheme</code>is true, expand the Data URL scheme for the base64 string of the picture.
     * @param image Path to Picture File
     * @param appendDataURLScheme Whether to expand the Data URL scheme prefix
     * @return base64 string converted from picture file
     */
    public static String toBase64(File image, boolean appendDataURLScheme) {
        String imageBase64 = bytesEncode2Base64(toBytes(image));
        if(appendDataURLScheme) {
            imageBase64 = ImageDataURISchemeMapper.getScheme(image) + imageBase64;
        }
        return imageBase64;
    }

    private static String bytesEncode2Base64(byte[] bytes) {
        return new String(Base64.getEncoder().encode(bytes), StandardCharsets.UTF_8);
    }

    private static byte[] base64Decode2Bytes(String base64) {
        return Base64.getDecoder().decode(base64);
    }

    /**
     * Restore byte array to picture file
     * 
     * @param imageBytes
     *            byte array of picture files
     * @param imagePath
     *            Save Address for Recovered Picture Files
     * @return If the build is successful, the generated file path is returned, where the result is <code>imagePath</code> for the parameter.Otherwise return null
     */
    public static File toImage(byte[] imageBytes, File imagePath) {
        if (!imagePath.getParentFile().exists()) {
            imagePath.getParentFile().mkdirs();
        }
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(imagePath))) {
            bos.write(imageBytes);
            return imagePath;
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * Restore base64 string to picture file
     * 
     * @param imageBase64
     *            base64 string for picture file
     * @param imagePath
     *            Save Address for Recovered Picture Files
     * @return If the build is successful, the generated file path is returned, where the result is <code>imagePath</code> for the parameter.Otherwise return null
     */
    public static File toImage(String imageBase64, File imagePath) {
        // There is no','in the base64 string.
        int firstComma = imageBase64.indexOf(",");
        if(firstComma >= 0) {
            imageBase64 = imageBase64.substring(firstComma + 1);
        }
        return toImage(base64Decode2Bytes(imageBase64), imagePath);
    }

    /**
     * Save imageBase64 to the specified file.If <code>fileName</code>contains an extension, use the extension <code>fileName</code>directly.
     * Otherwise, if <code>imageBase64</code>is a Data URLs, the extension will be judged by a more prefix.If the extension cannot be determined, use "png" as the default extension.
     * @param imageBase64 base64 encoded string for picture
     * @param dir Directory to save pictures
     * @param fileName Name of picture
     * @return If the build is successful, the generated file path is returned.Otherwise return null
     */
    public static File toImage(String imageBase64, File dir, String fileName) {
        File imagePath = null;
        if(fileName.indexOf(".") < 0) {
            String extension = ImageDataURISchemeMapper.getExtensionFromImageBase64(imageBase64, "png");
            imagePath = new File(dir, fileName + "." + extension);
        } else {
            imagePath = new File(dir, fileName);
        }
        return toImage(imageBase64, imagePath);
    }    
    
    public static String JsonParser(String sPrmJsonData) throws JSONException{
        String sPatientname;
        String sHN;
        String sAN;
        String sStartdate;
        String sDepartmentuid;
        String sDepartmentname;
        String sDrcode;
        String sDrname;
        boolean bStatus;
        boolean bCheckorder;
        String sNewStatus;
        String sEncounterType;
        boolean bMedicalDischarge;
        boolean bEmergency;
        String sNewHN;
        String sTitleName;
        String sFirstNameLoc;
        String sFirstNameEng;
        String sMiddleNameLoc;
        String sMiddleNameEng;
        String sLastNameLoc;
        String sLastNameEng;
        String sDateOfBirth;
        String sGender;
        String sNationalityLoc;
        String sNationalityEng;
        String sNationId;
        String sAdrFull;
        String sAdrNum;
        String sAdrArea;
        String sAdrCity;
        String sAdrState;
        String sAdrCountry;
        String sAdrZipcode;
        String sContactPhone;
        String sContactEmail;
        boolean bVIP;
        String sNewRegisterDate;
        String sImage;
        String sPassport;
        String sNewDepCode;
        String sNewDepNameLoc;
        String sNewDepNameEng;
        String sNewDocCode;
        String sNewDocLoc;
        String sNewDocEng;        
        String sDisplayMsg = "";
            
        JSONArray jsonArr = new JSONArray(sPrmJsonData);
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < jsonArr.length(); i++){
            JSONObject jsonObj = jsonArr.getJSONObject(i);
            System.out.println(jsonObj);

            try{
                sPatientname = "Patient Name : " + jsonObj.getString("patientname");
            }
            catch (Exception e) {
                sPatientname = "Patient Name : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sPatientname;
            
            try{
                sHN = "HN : " + jsonObj.getString("HN");
            }
            catch (Exception e) {
                sHN = "HN : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sHN;
            
            try{
                sAN = "VN/AN : " + jsonObj.getString("AN");
            }
            catch (Exception e) {
                sAN = "VN/AN : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sAN;
            
            try{
                sStartdate = "Start Date : " + jsonObj.getString("startdate");
            }
            catch (Exception e) {
                sStartdate = "Start Date : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sStartdate;
            
            try{
                sDepartmentuid = "Department ID : " + jsonObj.getString("departmentuid");
            }
            catch (Exception e) {
                sDepartmentuid = "Department ID : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sDepartmentuid;
            
            try{
                sDepartmentname = "Department Name : " + jsonObj.getString("departmentname");
            }
            catch (Exception e) {
                sDepartmentname = "Department Name : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sDepartmentname;
            
            try{
                sDrcode = "Doctor Code : " + jsonObj.getString("drcode");
            }
            catch (Exception e) {
                sDrcode = "Doctor Code : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sDrcode;
            
            try{
                sDrname = "Doctor Name : " + jsonObj.getString("drname");
            }
            catch (Exception e) {
                sDrname = "Doctor Name : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sDrname + "\n";
            
            
            bStatus = jsonObj.getBoolean("status");
            bCheckorder = jsonObj.getBoolean("checkorder");
            // sDisplayMsg = sHN + ", " + sPatientname + ", " + sAN + ", " + sStartdate + ", " + sDepartmentuid + ", " + sDepartmentname + ", " + sDrcode + ", " + sDrname + "\n\n";
            sDisplayMsg = sDisplayMsg + "##################### New Version #####################\n";
            
            try{
                sNewStatus = "New Status : " + jsonObj.getString("_status");
            }
            catch (Exception e) {
                sNewStatus = "New Status : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sNewStatus;

            try{
                sEncounterType = "Encounter Type : " + jsonObj.getString("encountertype");
            }
            catch (Exception e) {
                sEncounterType = "Encounter Type : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sEncounterType;
            
            bMedicalDischarge = jsonObj.getBoolean("ismedicaldischarge");
            bEmergency = jsonObj.getBoolean("isemergency");
            
            try{
                sNewHN = "New HN : " + jsonObj.getJSONObject("patient").getString("HN");
            }
            catch (Exception e) {
                sNewHN = "New HN : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sNewHN;
            
            try{
                sTitleName = "Title Name : " + jsonObj.getJSONObject("patient").getString("titlename");
            }
            catch (Exception e) {
                sTitleName = "Title Name : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sTitleName;

            try{
                sFirstNameLoc = "First Name Local : " + jsonObj.getJSONObject("patient").getJSONObject("firstname").getString("th");
            }
            catch (Exception e) {
                sFirstNameLoc = "First Name Local : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sFirstNameLoc;

            try{
                sFirstNameEng = "First Name Eng : " + jsonObj.getJSONObject("patient").getJSONObject("firstname").getString("en");
            }
            catch (Exception e) {
                sFirstNameEng = "First Name Eng : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sFirstNameEng;
            
            try{
                sMiddleNameLoc = "Middle Name Local : " + jsonObj.getJSONObject("patient").getJSONObject("middlename").getString("th");
            }
            catch (Exception e) {
                sMiddleNameLoc = "Middle Name Local : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sMiddleNameLoc;

            try{
                sMiddleNameEng = "Middle Name Eng : " + jsonObj.getJSONObject("patient").getJSONObject("middlename").getString("en");
            }
            catch (Exception e) {
                sMiddleNameEng = "Middle Name Eng : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sMiddleNameEng;
            
            try{
                sLastNameLoc = "Last Name Local : " + jsonObj.getJSONObject("patient").getJSONObject("lastname").getString("th");
            }
            catch (Exception e) {
                sLastNameLoc = "Last Name Local : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sLastNameLoc;

            try{
                sLastNameEng = "Last Name Eng : " + jsonObj.getJSONObject("patient").getJSONObject("lastname").getString("en");
            }
            catch (Exception e) {
                sLastNameEng = "Last Name Eng : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sLastNameEng;
            
            try{
                sDateOfBirth = "Date Of Birth : " + jsonObj.getJSONObject("patient").getString("dateofbirth");
            }
            catch (Exception e) {
                sDateOfBirth = "Date Of Birth : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sDateOfBirth;
            
            try{
                sGender = "Gender : " + jsonObj.getJSONObject("patient").getString("gender");
            }
            catch (Exception e) {
                sGender = "Gender : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sGender;
            
            try{
                sNationalityLoc = "Nationality Local : " + jsonObj.getJSONObject("patient").getJSONObject("nationality").getString("th");
            }
            catch (Exception e) {
                sNationalityLoc = "Nationality Local : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sNationalityLoc;

            try{
                sNationalityEng = "Nationality Eng : " + jsonObj.getJSONObject("patient").getJSONObject("nationality").getString("en");
            }
            catch (Exception e) {
                sNationalityEng = "Nationality Eng : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sNationalityEng;
            
            try{
                sNationId = "Nation Id : " + jsonObj.getJSONObject("patient").getString("nationid");
            }
            catch (Exception e) {
                sNationId = "Nation Id : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sNationId;
            
            try{
                sAdrFull = "Address Full : " + jsonObj.getJSONObject("patient").getJSONObject("address").getString("fulladdress");
            }
            catch (Exception e) {
                sAdrFull = "Address Full : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sAdrFull;

            try{
                sAdrNum = "Address Num : " + jsonObj.getJSONObject("patient").getJSONObject("address").getString("housenumber");
            }
            catch (Exception e) {
                sAdrNum = "Address Num : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sAdrNum;
            
            try{
                sAdrArea = "Address Area : " + jsonObj.getJSONObject("patient").getJSONObject("address").getString("area");
            }
            catch (Exception e) {
                sAdrArea = "Address Area : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sAdrArea;

            try{
                sAdrCity = "Address City : " + jsonObj.getJSONObject("patient").getJSONObject("address").getString("city");
            }
            catch (Exception e) {
                sAdrCity = "Address City : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sAdrCity;

            try{
                sAdrState = "Address State : " + jsonObj.getJSONObject("patient").getJSONObject("address").getString("state");
            }
            catch (Exception e) {
                sAdrState = "Address State : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sAdrState;            

            try{
                sAdrCountry = "Address Country : " + jsonObj.getJSONObject("patient").getJSONObject("address").getString("country");
            }
            catch (Exception e) {
                sAdrCountry = "Address Country : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sAdrCountry;

            try{
                sAdrZipcode = "Address Zip Code : " + jsonObj.getJSONObject("patient").getJSONObject("address").getString("zipcode");
            }
            catch (Exception e) {
                sAdrZipcode = "Address Zip Code : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sAdrZipcode;     
            
            try{
                sContactPhone = "Contact Phone : " + jsonObj.getJSONObject("patient").getJSONObject("contact").getString("phone");
            }
            catch (Exception e) {
                sContactPhone = "Contact Phone : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sContactPhone;

            try{
                sContactEmail = "Contact Email : " + jsonObj.getJSONObject("patient").getJSONObject("contact").getString("emailid");
            }
            catch (Exception e) {
                sContactEmail = "Contact Email : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sContactEmail;
            
            bVIP = jsonObj.getJSONObject("patient").getBoolean("isvip");
            
            try{
                sNewRegisterDate = "New Register Date : " + jsonObj.getJSONObject("patient").getString("registereddate");
            }
            catch (Exception e) {
                sNewRegisterDate = "New Register Date : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sNewRegisterDate;    
            
            try{
                sImage = "Image : " + jsonObj.getJSONObject("patient").getString("image");
            }
            catch (Exception e) {
                sImage = "Image : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sImage;    

            try{
                sPassport = "Passport : " + jsonObj.getJSONObject("patient").getString("passport");
            }
            catch (Exception e) {
                sPassport = "Passport : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sPassport;                
            
            try{
                sNewDepCode = "New Department Code : " + jsonObj.getJSONObject("department").getString("code");
            }
            catch (Exception e) {
                sNewDepCode = "New Department Code : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sNewDepCode;
            
            try{
                sNewDepNameLoc = "New Department Name Local : " + jsonObj.getJSONObject("department").getJSONObject("name").getString("th");
            }
            catch (Exception e) {
                sNewDepNameLoc = "New Department Name Local : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sNewDepNameLoc;
            
            try{
                sNewDepNameEng = "New Department Name Eng : " + jsonObj.getJSONObject("department").getJSONObject("name").getString("en");
            }
            catch (Exception e) {
                sNewDepNameEng = "New Department Name Eng : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sNewDepNameEng;
            
            try{
                sNewDocCode = "New Doctor Code : " + jsonObj.getJSONObject("careprovider").getString("code");
            }
            catch (Exception e) {
                sNewDocCode = "New Doctor Code : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sNewDocCode;
            
            try{
                sNewDocLoc = "New Doctor Name Local : " + jsonObj.getJSONObject("careprovider").getJSONObject("name").getString("th");
            }
            catch (Exception e) {
                sNewDocLoc = "New Doctor Name Local : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sNewDocLoc;
            
            try{
                sNewDocEng = "New Doctor Name Eng : " + jsonObj.getJSONObject("careprovider").getJSONObject("name").getString("en");
            }
            catch (Exception e) {
                sNewDocEng = "New Doctor Name Eng : (NULL)";
            }
            sDisplayMsg = sDisplayMsg + "\n" + sNewDocEng + "\n\n";
            
            String sXrayResult;
            String sdoctorcode;
            String sdeptcode;
            String scode;
            String sname;
            String sresult;
            String sresultdate;
            JSONArray jsonArrSub;
            
            try{
                jsonArrSub = jsonObj.getJSONArray("xrays");     
            }
            catch (Exception e) {
                jsonArrSub = new JSONArray();
            }
            
            if(jsonArrSub != null){
                sDisplayMsg = sDisplayMsg + "X-Ray Result\n";
                for (int iSub = 0; iSub < jsonArrSub.length(); iSub++){
                    JSONObject jsonObjSub = jsonArrSub.getJSONObject(iSub);

                    sdoctorcode = jsonObjSub.getString("doctorcode");
                    sdeptcode = jsonObjSub.getString("deptcode");
                    scode = jsonObjSub.getString("code");
                    sname = jsonObjSub.getString("name");
                    sresult = jsonObjSub.getString("result");
                    sresultdate = jsonObjSub.getString("resultdate");
                    sDisplayMsg = sDisplayMsg + (iSub+1) + ") " + sdoctorcode + " - " + sdeptcode + " - " + scode + " - " + sname + "\n - " + sresult + "\n - " + sresultdate + "\n\n";

                }
            }
        }
        
        return sDisplayMsg;
            
    }    
    
    private static String extractMimeType(final String encoded) {
        final Pattern mime = Pattern.compile("^data:([a-zA-Z0-9]+/[a-zA-Z0-9]+).*,.*");
        final Matcher matcher = mime.matcher(encoded);
        if (!matcher.find())
            return "";
        return matcher.group(1).toLowerCase();
    }  
    
    public String imageEncoderWithFileUseApache(File fPrmImage) throws IOException {
    
        return "";
    }
    
    public String imageEncoderWithFile(File fPrmImage) throws IOException {
        String encodedfile = null;
        try {
            FileInputStream fileInputStreamReader = new FileInputStream(fPrmImage);
            byte[] bytes = new byte[(int)fPrmImage.length()];
            fileInputStreamReader.read(bytes);
            // encodedfile = Base64.encodeBase64(bytes).toString();
            encodedfile = Base64.getEncoder().withoutPadding().encodeToString(bytes);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return encodedfile;
    }    
    
    public String imageEncoder(String sPrmFilePath) throws IOException {
        // read image from file
        FileInputStream stream = new FileInputStream(sPrmFilePath);

        // get byte array from image stream
        int bufLength = 2048;
        byte[] buffer = new byte[2048];
        byte[] data;       
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int readLength;
        while ((readLength = stream.read(buffer, 0, bufLength)) != -1) {
            out.write(buffer, 0, readLength);
        }

        data = out.toByteArray();
        String sBase64Encoded = Base64.getEncoder().withoutPadding().encodeToString(data);

        out.close();
        stream.close();
        // System.out.println("Encode Image Result : " + sBase64Encoded);
        
        return sBase64Encoded;
    }
    
    
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
            java.util.logging.Logger.getLogger(PostWebManualV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostWebManualV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostWebManualV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostWebManualV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostWebManualV2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JRadioButton jrbRequestType0;
    private javax.swing.JRadioButton jrbRequestType1;
    private javax.swing.JRadioButton jrbRequestType2;
    private javax.swing.JRadioButton jrbRequestType3;
    private javax.swing.JRadioButton jrbRequestType4;
    private javax.swing.JRadioButton jrbRequestType5;
    private javax.swing.JRadioButton jrbRequestType6;
    private javax.swing.JTextField jtxtAuthorizeDate;
    private javax.swing.JTextField jtxtAuthorizeKey;
    private javax.swing.JTextField jtxtTokenType;
    private javax.swing.JTextField jtxtTransactionNo;
    private javax.swing.JLabel lblPatientID10;
    private javax.swing.JLabel lblPatientID11;
    private javax.swing.JLabel lblPatientID12;
    private javax.swing.JLabel lblPatientID13;
    private javax.swing.JLabel lblPatientID14;
    private javax.swing.JLabel lblPatientID15;
    private javax.swing.JLabel lblPatientID16;
    private javax.swing.JLabel lblPatientID17;
    private javax.swing.JLabel lblPatientID18;
    private javax.swing.JLabel lblPatientID19;
    private javax.swing.JLabel lblPatientID6;
    private javax.swing.JLabel lblPatientID7;
    private javax.swing.JLabel lblPatientID8;
    private javax.swing.JLabel lblPatientID9;
    private javax.swing.JList<String> lstArrJson;
    private javax.swing.JRadioButton rbtContentType0;
    private javax.swing.JRadioButton rbtContentType1;
    private javax.swing.JRadioButton rbtContentType2;
    private javax.swing.JRadioButton rbtContentType3;
    private javax.swing.JRadioButton rbtDecrypte;
    private javax.swing.JRadioButton rbtEncrypte;
    private javax.swing.JRadioButton rbtRequestMethodGet;
    private javax.swing.JRadioButton rbtRequestMethodPost;
    private javax.swing.JTabbedPane tabRequestDetail;
    private javax.swing.JTextArea txaAESKey;
    private javax.swing.JTextArea txaAuthCode;
    private javax.swing.JTextArea txaAuthorization;
    private javax.swing.JTextArea txaAuthorizeData;
    private javax.swing.JTextArea txaContent;
    private javax.swing.JTextArea txaParameter;
    private javax.swing.JTextArea txaPostData;
    private javax.swing.JTextArea txaPostDataEncode;
    private javax.swing.JTextArea txaResult;
    private javax.swing.JTextArea txaURL;
    private javax.swing.JTextField txtAESCipher;
    private javax.swing.JTextField txtAESReplace;
    // End of variables declaration//GEN-END:variables
}
