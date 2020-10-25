grammar TibiaCard;

@header {
  import br.ufscar.dc.compiladores.tibiacard.Arquivo;
}



/* DEFINIÇÃO DA GRAMÁTICA */

PalavrasChave: 
    'level' | 'premium account' | 'Ataque' | 'Lute' | 'Cure' |
    'sim' | 'nao' | 'master sorcerer' | 'royal paladin' | 'elite knight' | 
    'elder druid' | 'inicio personagem' | 'fim personagem';

Delimitador: 
    ':';

Abre: 
    '(' | '[';

Fecha: 
    ')' | ']';

Virgula: 
    ',';

Nome:
    ('A'..'Z')('a'..'z')+ (' ' ('A'..'Z')('a'..'z')+)?;
 
Nivel:
    ('0'..'9')+;

Mana:
    ('0'..'9')+;

MagiaAtaque:
    'exori gran ico' | 'exori' | 'exori ico' | 'exori gran' | 'exori min' |
    'exori mas' | 'exori hur' |'exevo gran mas frigo' | 'exevo frigo hur' | 
    'exori moe ico' | 'exevo gran frigo hur' | 'exevo tera hur' | 'exevo gran mas tera'|
    'exevo flam hur' | 'exevo vis lux' | 'exevo gran vis lux' | 'exevo vis hur' |
    'exevo gran mas flam' | 'exevo gran mas vis' | 'exevo mas san' | 'exori san' |
    'exori con' | 'exori gran con';

MagiaCura:
    'exura' | 'exura gran' | 'exura vita' | 'exura san' | 'exura gran san' | 
    'utura' | 'utura gran' | 'exura sio' | 'exura gran mas res' | 'exura gran ico' | 
    'exura ico';



/* DEFINIÇÃO DAS REGRAS DA GRAMÁTICA */

programa:
    corpo;
    
corpo:
    declaracao_local+ cmd*; 
    
declaracao_local:
    'inicio personagem'
        Nome ':' classe 
        Nivel ':' 'level' 
        status ':' 'premium account'
    'fim personagem';

classe:
    'master sorcerer' | 'royal paladin' | 'elite knight' | 'elder druid';
    
status:
    'sim' | 'nao';    
    
cmd:
    cmdAtaque | cmdLute | cmdCura;
    
cmdAtaque:
    'Ataque' '(' Nome (',' magiaAtaque)+ ')';
    
cmdLute:
    'Lute' '(' Nome ')';
    
cmdCura:
    'Cure' '(' Nome (',' magiaCura)+ ')';

magiaAtaque:
    magiaAtaqueEK | magiaAtaqueED | magiaAtaqueRP | magiaAtaqueMS;

magiaCura:
    magiaCuraEK | magiaCuraED | magiaCuraRP | magiaCuraMS;

magiaAtaqueEK:
    'exori gran ico' | 'exori' | 'exori ico' | 'exori gran' | 'exori min' | 'exori mas' | 'exori hur';

magiaCuraEK:
    'exura gran ico' | 'exura ico';

magiaAtaqueED:
    'exevo gran mas frigo' | 'exevo frigo hur' | 'exori moe ico' | 'exevo gran frigo hur' | 'exevo tera hur' | 'exevo gran mas tera';

magiaCuraED:
    'exura sio' | 'exura gran mas res';

magiaAtaqueMS:
    'exevo flam hur' | 'exevo vis lux' | 'exevo gran vis lux' | 'exevo vis hur' | 'exevo gran mas flam' | 'exevo gran mas vis';

magiaCuraMS:
    'exura' | 'exura gran' | 'exura vita';

magiaAtaqueRP:
    'exevo mas san' | 'exori san' | 'exori con' | 'exori gran con';

magiaCuraRP:
    'exura san' | 'exura gran san' | 'utura' | 'utura gran';



    
/* ATRIBUTOS QUE DEVEM SER IGNORADOS PELO COMPILADOR */
Comentario: 
    '{' ~('\n'|'\r'|'}'|'{')* '\r'? '}' { skip(); };

WhiteSpace: 
    (' ' | '\t' | '\r' | '\n') { skip(); };



/* ERROS QUE PODEM ACONTECER */
    
ErroComentario: 
    '{'
    { Arquivo.AdicionaString("                    <div id=\"erros\">" + 
                    "Comentário não fechado</div>\n");
    Arquivo.gravaArquivo(); };

/* Engloba qualquer outro tipo de regra não colocada na linguagem para que o compilador possa exibir um erro */
ANY: 
    .
    { Arquivo.AdicionaString("                    <div id=\"erros\">" + 
                    "Símbolo não identificado</div>\n");
    Arquivo.gravaArquivo(); };
