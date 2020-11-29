var USnum = '';
$(function() {
	/**지도표시용ajax**/
	
	var sy='d';
		$.ajax({
			method : 'post'
			, url : 'countAllEx'
			, success : output
		});
	
	function output (resp){
			//USnum = JSON.stringify(resp);
			//USnum = parseInt(USnum);
			//alert(typeof USnum);
			//var exData=[];
		var exData={};	
		for (var i in resp){
				
			 exData={
					"AF" : 0,
	                "AL" : 0,
	                "DZ" : resp[38].num,
	                "AO" : 0,
	                "AG" : 0,
	                "AR" : resp[36].num,
	                "AM" : 0,
	                "AU" : resp[42].num,
	                "AT" : resp[43].num,
	                "AZ" : resp[37].num,
	                "BS" : 0,
	                "BH" : 0,
	                "BD" : resp[20].num,
	                "BB" : 0,
	                "BY" : 0,
	                "BE" : resp[23].num,
	                "BZ" : 0,
	                "BJ" : 0,
	                "BT" : 0,
	                "BO" : 0,
	                "BA" : 0,
	                "BW" : 0,
	                "BR" : resp[25].num,
	                "BN" : 0,
	                "BG" : resp[24].num,
	                "BF" : 0,
	                "BI" : 0,
	                "KH" : resp[60].num,
	                "CM" : 0,
	                "CA" : resp[61].num,
	                "CV" : 0,
	                "CF" : 0,
	                "TD" : 0,
	                "CL" : resp[57].num,
	                "CN" : resp[55].num,
	                "CO" : resp[64].num,
	                "KM" : 0,
	                "CD" : 0,
	                "CG" : 0,
	                "CR" : resp[66].num,
	                "CI" : resp[63].num,
	                "HR" : 0,
	                "CY" : 0,
	                "CZ" : resp[56].num,
	                "DK" : resp[7].num,
	                "DJ" : 0,
	                "DM" : 0,
	                "DO" : resp[8].num,
	                "EC" : 0,
	                "EG" : resp[50].num,
	                "SV" : 0,
	                "GQ" : 0,
	                "ER" : 0,
	                "EE" : 0,
	                "ET" : resp[39].num,
	                "FJ" : 0,
	                "FI" : resp[75].num,
	                "FR" : resp[74].num,
	                "GA" : 0,
	                "GM" : 0,
	                "GE" : 0,
	                "DE" : resp[9].num,
	                "GH" : 0,
	                "GR" : resp[1].num,
	                "GD" : 0,
	                "GT" : 0,
	                "GN" : 0,
	                "GW" : 0,
	                "GY" : 0,
	                "HT" : 0,
	                "HN" : resp[44].num,
	                "HK" : 0,
	                "HU" : resp[77].num,
	                "IS" : 0,
	                "IN" : resp[52].num,
	                "ID" : resp[53].num,
	                "IR" : resp[48].num,
	                "IQ" : 0,
	                "IE" : 0,
	                "IL" : resp[49].num,
	                "IT" : resp[51].num,
	                "JM" : 0,
	                "JP" : resp[54].num,
	                "JO" : resp[45].num,
	                "KZ" : resp[58].num,
	                "KE" : resp[62].num,
	                "KI" : 0,
	                "KR" : 0,
	                "KW" : resp[65].num,
	                "KG" : 0,
	                "LA" : 0,
	                "LV" : 0,
	                "LB" : resp[11].num,
	                "LS" : 0,
	                "LR" : 0,
	                "LY" : 0,
	                "LT" : 0,
	                "LU" : 0,
	                "MK" : 0,
	                "MG" : 0,
	                "MW" : 0,
	                "MY" : resp[14].num,
	                "MV" : 0,
	                "ML" : 0,
	                "MT" : 0,
	                "MR" : 0,
	                "MU" : 0,
	                "MX" : resp[15].num,
	                "MD" : 0,
	                "MN" : resp[17].num,
	                "ME" : 0,
	                "MA" : resp[16].num,
	                "MZ" : 0,
	                "MM" : resp[19].num,
	                "NA" : 0,
	                "NP" : 0,
	                "NL" : resp[4].num,
	                "NZ" : resp[5].num,
	                "NI" : 0,
	                "NE" : 0,
	                "NG" : resp[2].num,
	                "NO" : 413.51,
	                "OM" : resp[41].num,
	                "PK" : resp[71].num,
	                "PA" : resp[70].num,
	                "PG" : 0,
	                "PY" : 0,
	                "PE" : resp[72].num,
	                "PH" : resp[76].num,
	                "PL" : resp[73].num,
	                "PT" : 0,
	                "QA" : resp[59].num,
	                "RO" : resp[12].num,
	                "RU" : resp[10].num,
	                "RW" : 0,
	                "WS" : 0,
	                "ST" : 0,
	                "SA" : resp[26].num,
	                "SN" : 0,
	                "RS" : resp[27].num,
	                "SC" : 0,
	                "SL" : resp[33].num,
	                "SG" : 0,
	                "SK" : resp[32].num,
	                "SI" : 0,
	                "SB" : 0,
	                "ZA" : resp[3].num,
	                "ES" : resp[31].num,
	                "LK" : resp[28].num,
	                "KN" : 0,
	                "LC" : 0,
	                "VC" : 0,
	                "SD" : 0,
	                "SR" : 0,
	                "SZ" : 0,
	                "SE" : resp[29].num,
	                "CH" : resp[30].num,
	                "SY" : 0,
	                "TW" : 0,
	                "TJ" : 0,
	                "TZ" : 0,
	                "TH" : resp[67].num,
	                "TL" : 0,
	                "TG" : 0,
	                "TO" : 0,
	                "TT" : resp[69].num,
	                "TN" : 0,
	                "TR" : resp[68].num,
	                "TM" : resp[6].num,
	                "UG" : 0,
	                "UA" : resp[47].num,
	                "AE" : resp[35].num,
	                "GB" : resp[40].num,
	                "US" : resp[18].num,
	                "UY" : 0,
	                "UZ" : resp[46].num,
	                "VU" : 0,
	                "VE" : resp[21].num,
	                "VN" : resp[22].num,
	                "YE" : 0,
	                "ZM" : 0,
	                "ZW" : 0,
	                "GL" : 0
					
			};
			 
			
		};	
			
		 $('#world-map-markers').vectorMap({
			  map: 'world_mill_en',
			  backgroundColor: 'transparent',
			  zoomOnScroll: false,
			  series: {
			    regions: [{
			      values: exData,
			      scale: ['#a8f4d5', '#03b76c'],
			      normalizeFunction: 'polynomial'
			    }]
			  },
			  onRegionTipShow: function(e, el, code){
			    el.html(el.html()+' (게시글 수 : '+exData[code]+'개)');
			  }
			}); 
			
		}//resp
		
		
	/**지도표시용ajax**/
	
	
	
	
	





$('#india').vectorMap({
            map : 'in_mill',
            backgroundColor : 'transparent',
    zoomOnScroll: false,
            regionStyle : {
                initial : {
                    fill : '#55ce63'
                }
            }
        });


        $('#usa').vectorMap({
            map : 'us_aea_en',
            backgroundColor : 'transparent',
            zoomOnScroll: false,
            regionStyle : {
                initial : {
                    fill : '#7460ee'
                }
            }
        });
        
       
        
        $('#australia').vectorMap({
            map : 'au_mill',
            backgroundColor : 'transparent',
            zoomOnScroll: false,
            regionStyle : {
                initial : {
                    fill : '#ffca4a'
                }
            }
        });
        
         $('#uk').vectorMap({
            map : 'uk_mill_en',
            backgroundColor : 'transparent',
             zoomOnScroll: false,
            regionStyle : {
                initial : {
                    fill : '#f62d51'
                }
            }
        });

  });      
        