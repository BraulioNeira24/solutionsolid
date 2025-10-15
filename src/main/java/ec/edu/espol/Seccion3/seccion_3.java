public class seccion_3 {
    //1. Crear interfaces para abstraer responsabilidades   
    public interface IPago {
        void realizarCobro(double monto);
    }
    
    public interface IFactura {
        void calcularImpuestos();
        void generarFactura();
    }
    
    public interface INotificador {
        void notificar(IPago pago);
    }
    
    //2. Separar responsabilidades de la clase Pago
    public class PagoBase implements IPago {
        @Override
        public void realizarCobro(double monto) {
            // lógica general de cobro
        }
    }
    
    public class PagoPayPal implements IPago {
        private boolean loggedIn;
    
        public PagoPayPal(boolean loggedIn) {
            this.loggedIn = loggedIn;
        }
    
        @Override
        public void realizarCobro(double monto) {
            if (!loggedIn) {
                throw new IllegalStateException("Usuario no autenticado en PayPal.");
            }
        }
    }
    
    
    //3. Crear clases para Facturación
    public class Factura implements IFactura {
        @Override
        public void calcularImpuestos() {
            // lógica de impuestos
        }
    
        @Override
        public void generarFactura() {
            // lógica de factura
        }
    }
    
    
    //4. Clases de notificación con OCP
    public class NotificadorEmail implements INotificador {
        @Override
        public void notificar(IPago pago) {
            // lógica para enviar email
        }
    }
    
    public class NotificadorSMS implements INotificador {
        @Override
        public void notificar(IPago pago) {
            // lógica para enviar SMS
        }
    }
    
    public class NotificadorSignal implements INotificador {
        @Override
        public void notificar(IPago pago) {
            // lógica para enviar Signal
        }
    }
    
    
    //5. Refactor de la clase Compra
        public class Compra {
        private IPago metodoPago;
        private INotificador notificador;
        private List<Articulo> articulos;
    
        public Compra(IPago metodoPago, INotificador notificador) {
            this.metodoPago = metodoPago;
            this.notificador = notificador;
            this.articulos = new ArrayList<>();
        }
    
        public void agregarArticulo(Articulo articulo) {
            articulos.add(articulo);
        }
    
        public void removerArticulo(Articulo articulo) {
            articulos.remove(articulo);
        }
    
        public void procesarCompra() {
            metodoPago.realizarCobro(calcularTotal());
            notificador.notificar(metodoPago);
        }
    
        private double calcularTotal() {
            // sumar precios de los artículos
            return 0;
        }
    }
    
        
        
        
        
        
    
        public static void main(String[] args) {
            System.out.println("Hello World!");
        }
    }
    
    
