package src.com.ecn.urbapp.utils;

import org.osmdroid.util.GeoPoint;
import org.osmdroid.bonuspack.overlays.Marker;

/**
* Defines a mix of differents objects, needed for the Async method
* Contains
*                         a marker
*                         the position
*                         the address (facultative first)
* @author Sebastien
*
*/
public class MarkerPos {

        /**
         * The marker on the map
         */
        private Marker marker;
        /**
         * The position of this marker
         */
        private GeoPoint position;
        /**
         * Physical Address of the marker
         */
        private String adresse="Adresse inconnue";

        /**
         * Constructor for MarkerPos from a marker and position objects
         * @param marker
         * @param position
         */
        public MarkerPos(Marker marker, GeoPoint position) {
                super();
                this.marker = marker;
                this.position = position;
        }

        /**
         * Copy Constructor
         * @param markpos
         */
        public MarkerPos(MarkerPos markpos) {
                super();
                this.marker = markpos.getMarker();
                this.position = markpos.getPosition();
                this.adresse = markpos.getAdresse();
        }
        /**
         * Get a marker from a MarkerPos object
         * @return Marker
         */
        public Marker getMarker() {
                return marker;
        }

        /**
         *
         * @param marker
         */
        public void setMarker(Marker marker) {
                this.marker = marker;
        }

        /**
         *
         * @return
         */
        public GeoPoint getPosition() {
                return position;
        }

        /**
         *
         * @param position
         */
        public void setPosition(GeoPoint position) {
                this.position = position;
        }

        /**
         *
         * @return
         */
        public String getAdresse() {
                return adresse;
        }

        /**
         *
         * @param adresse
         */
        public void setAdresse(String adresse) {
                this.adresse = adresse;
        }
}