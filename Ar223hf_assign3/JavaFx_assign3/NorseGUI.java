package JavaFx_assign3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class NorseGUI extends Application {

	public void start(Stage primaryStage) {

		ArrayList<NorseGod> godsList = new ArrayList<>();

		godsList.add(new NorseGod("Odin", "Aesir",
				"In Germanic mythology, Odin (from Old Norse Óðinn) is a widely revered god. In Norse mythology, \n"
						+ "from which stems most of the information about the god, Odin is associated with wisdom, healing, \n"
						+ "death, royalty, the gallows, knowledge, battle, sorcery, poetry, frenzy, and the runic alphabet, and is \n"
						+ "the husband of the goddess Frigg. In wider Germanic mythology and paganism, Odin was known in \n"
						+ "Old English as W?den, in Old Saxon as W?dan, and in Old High German as Wuotan or Wtan, all \n"
						+ "stemming from the reconstructed Proto-Germanic theonym\n" + "\n"
						+ "Odin is a prominently mentioned god throughout the recorded history of the Germanic peoples, \n"
						+ "from the Roman occupation of regions of Germania through the tribal expansions of the Migration \n"
						+ "Period and the Viking Age. In the modern period, Odin continued to be acknowledged in the rural \n"
						+ "folklore of Germanic Europe. References to Odin appear in place names throughout regions \n"
						+ "historically inhabited by the ancient Germanic peoples, and the day of the week Wednesday bears \n"
						+ "his name in many Germanic languages, including English.\n" + "\n"
						+ "In Old English texts, Odin holds a particular place as a euhemerized ancestral figure among royalty, \n"
						+ "and he is frequently referred to as a founding figure among various other Germanic peoples, \n"
						+ "including the Langobards. Forms of his name appear frequently throughout the Germanic record, \n"
						+ "though narratives regarding Odin are mainly found in Old Norse works recorded in Iceland, primarily \n"
						+ "around the 13th century. These texts make up the bulk of modern understanding of Norse \n"
						+ "mythology.\n" + "\n"
						+ "In Old Norse texts, Odin is depicted as one-eyed and long-bearded, frequently wielding a spear \n"
						+ "named Gungnir, and wearing a cloak and a broad hat. He is often accompanied by his animal \n"
						+ "companions and familiars—the wolves Geri and Freki and the ravens Huginn and Muninn, who bring \n"
						+ "him information from all over Midgard—and rides the flying, eight-legged steed Sleipnir across the \n"
						+ "sky and into the underworld. Odin is attested as having many sons, most famously the gods Thor \n"
						+ "(with Jörð) and Baldr (with Frigg), and is known by hundreds of names. In these texts, he frequently \n"
						+ "seeks greater knowledge, at times in disguise (most famously by obtaining the Mead of Poetry), \n"
						+ "makes wagers with his wife Frigg over the outcome of exploits, and takes part in both the creation of \n"
						+ "the world by way of slaying the primordial being Ymir and the gift of life to the first two humans Ask \n"
						+ "and Embla. Odin has a particular association with Yule, and mankind's knowledge of both the runes \n"
						+ "and poetry is also attributed to him, giving Odin aspects of the culture hero.\n" + "\n"
						+ "In Old Norse texts, female beings associated with the battlefield—the valkyries—are associated with \n"
						+ "the god and Odin oversees Valhalla, where he receives half of those who die in battle, the einherjar. \n"
						+ "The other half are chosen by the goddess Freyja for her afterlife location, Fólkvangr. Odin consults \n"
						+ "the disembodied, herb-embalmed head of the wise being Mímir for advice, and during the foretold \n"
						+ "events of Ragnarök, Odin is told to lead the einherjar into battle before being consumed by the \n"
						+ "monstrous wolf Fenrir. In later folklore, Odin appears as a leader of the Wild Hunt, a ghostly \n"
						+ "procession of the dead through the winter sky. He is associated with charms and other forms of \n"
						+ "magic, particularly in Old English and Old Norse texts.\n" + "\n"
						+ "Odin is a frequent subject of study in Germanic studies, and numerous theories have been put \n"
						+ "forward regarding his development. Some of these focus on Odin's particular relation to other \n"
						+ "figures; for example, the fact that Freyja's husband Óðr appears to be something of an etymological \n"
						+ "doublet of the god, whereas Odin's wife Frigg is in many ways similar to Freyja, and that Odin has a \n"
						+ "particular relation to the figure of Loki. Other approaches focus on Odin's place in the historical \n"
						+ "record, a frequent question being whether the figure of Odin derives from Proto-Indo-European \n"
						+ "religion, or whether he developed later in Germanic society. In the modern period, Odin has inspired \n"
						+ "numerous works of poetry, music, and other forms of media. He is venerated in most forms of the \n"
						+ "new religious movement Heathenry, together with other gods venerated by the ancient Germanic \n"
						+ "peoples; some branches focus particularly on him."));

		godsList.add(new NorseGod("Tyr", "Aesir",
				"In Germanic mythology, Týr (Old Norse), Tíw (Old English), and Ziu (Old High German) is a god. Stemming from the Proto-Germanic deity *Tīwaz and ultimately from the Proto-Indo-European deity *Dyeus, little information about the god survives beyond Old Norse sources. Due to the etymology of the god's name and the shadowy presence of the god in the extant Germanic corpus, some scholars propose that Týr may have once held a more central place among the deities of early Germanic mythology.\n"
						+ "\n"
						+ "Týr is the namesake of the Tiwaz rune, a letter of the runic alphabet corresponding to the Latin letter T. By way of the process of interpretatio germanica, the deity is the namesake of Tuesday ('Týr's day') in Germanic languages, including English. Interpretatio romana, in which Romans interpret other gods as forms of their own, generally renders the god as Mars, the ancient Roman war god, and it is through that lens that most Latin references to the god occur. For example, the god may be referenced as Mars Thingsus (Latin 'Mars of the Thing') on 3rd century Latin inscription, reflecting a strong association with the Germanic thing, a legislative body among the ancient Germanic peoples still in use among some of its modern descendants."));

		
		godsList.add(new NorseGod("Thor", "Aesir",
				"In Norse mythology, Thor is the hammer-wielding Æsir god of thunder and lightning, associated with \n"
						+ "storms, oak trees, strength, hallowing, fertility, the protection of mankind and of the fortress of \n"
						+ "Asgard. The son of Odin All-Father and Jörð (the personification of Earth), he is physically the \n"
						+ "strongest of the Æsir. The cognate deity in wider Germanic mythology and paganism was known in \n"
						+ "Old English as Þunor (Thunor) and in Old High German as Donar , stemming from a Proto-Germanic \n"
						+ "*Þunraz, meaning \"thunder\".\n" + "\n"
						+ "Thor is a prominently mentioned god throughout the recorded history of the Germanic peoples, from \n"
						+ "the Roman occupation of regions of Germania, to the tribal expansions of the Migration Period, to \n"
						+ "his high popularity during the Viking Age, when, in the face of the process of the Christianization of \n"
						+ "Scandinavia, emblems of his hammer, Mjölnir, were worn and Norse pagan personal names \n"
						+ "containing the name of the god bear witness to his popularity.\n" + "\n"
						+ "Into the modern period, Thor continued to be acknowledged in rural folklore throughout Germanic \n"
						+ "regions. Thor is frequently referred to in place names, the day of the week bears his name, and \n"
						+ "names stemming from the pagan period containing his own continue to be used today.\n" + "\n"
						+ "In Norse mythology, largely recorded in Iceland from traditional material stemming from \n"
						+ "Scandinavia, numerous tales and information about Thor are provided. In these sources, Thor bears \n"
						+ "at least fifteen names, is the husband of the golden-haired goddess Sif, is the lover of the jötunn \n"
						+ "Járnsaxa, and is generally described as fierce eyed, red haired and red bearded.[1] With Sif, Thor \n"
						+ "fathered the goddess (and possible Valkyrie) Þrúðr; with Járnsaxa, he fathered Magni; with a mother \n"
						+ "whose name is not recorded, he fathered Móði, and he is the stepfather of the god Ullr. By way of \n"
						+ "Odin, Thor has numerous brothers, including Baldr. Thor has two servants, Þjálfi and Röskva, rides in \n"
						+ "a cart or chariot pulled by two goats, Tanngrisnir and Tanngnjóstr (that he eats and resurrects), and is \n"
						+ "ascribed three dwellings (Bilskirnir, Þrúðheimr, and Þrúðvangr). Thor wields the mountain-crushing \n"
						+ "hammer, Mjölnir, wears the belt Megingjörð and the iron gloves Járngreipr, and owns the staff \n"
						+ "Gríðarvölr. Thor's exploits, including his relentless slaughter of his foes and fierce battles with the \n"
						+ "monstrous serpent Jörmungandr—and their foretold mutual deaths during the events of Ragnarök—\n"
						+ "are recorded throughout sources for Norse mythology.\n" + "\n"
						+ "Thor has inspired numerous works of art and references to Thor appear in modern popular culture. \n"
						+ "Like other Germanic deities, veneration of Thor is revived in the modern period in Heathenry."));

		godsList.add(new NorseGod("Loki", "Giant",
				"Loki is a god in Norse mythology. Loki is in some sources the son of Fárbauti and Laufey, and the \n"
						+ "brother of Helblindi and Býleistr. By the jötunn Angrboða, Loki is the father of Hel, the wolf Fenrir, \n"
						+ "and the world serpent Jörmungandr. By his wife Sigyn, Loki is the father of Narfi and/or Nari. By the \n"
						+ "stallion Svaðilfari, Loki is the mother—giving birth in the form of a mare—to the eight-legged horse \n"
						+ "Sleipnir. In addition, Loki is referred to as the father of Váli in Prose Edda, though this source also \n"
						+ "refers to Odin as the father of Váli twice, and Váli is found mentioned as a Son of Loki only once.\n"
						+ "Loki's relation with the gods varies by source; Loki sometimes assists the gods and sometimes \n"
						+ "behaves in a malicious manner towards them. Loki is a shape shifter and in separate incidents he \n"
						+ "appears in the form of a salmon, a mare, a fly, and possibly an elderly woman named Þökk (Old \n"
						+ "Norse 'thanks'). Loki's positive relations with the gods end with his role in engineering the death of \n"
						+ "the god Baldr and Loki is eventually bound by Váli with the entrails of one of his sons. In both the \n"
						+ "Poetic Edda and the Prose Edda, the goddess Skaði is responsible for placing a serpent above him \n"
						+ "while he is bound. The serpent drips venom from above him that Sigyn collects into a bowl; however, \n"
						+ "she must empty the bowl when it is full, and the venom that drips in the meantime causes Loki to \n"
						+ "writhe in pain, thereby causing earthquakes. With the onset of Ragnarök, Loki is foretold to slip free \n"
						+ "from his bonds and to fight against the gods among the forces of the jötnar, at which time he will \n"
						+ "encounter the god Heimdallr and the two will slay each other.\n"
						+ "Loki is referred to in the Poetic Edda, compiled in the 13th century from earlier traditional sources; \n"
						+ "the Prose Edda and Heimskringla, written in the 13th century by Snorri Sturluson; the Norwegian \n"
						+ "Rune Poems, in the poetry of skalds, and in Scandinavian folklore. Loki may be depicted on the \n"
						+ "Snaptun Stone, the Kirkby Stephen Stone, and the Gosforth Cross. Loki's origins and role in Norse \n"
						+ "mythology, which some scholars have described as that of a trickster god, have been much debated \n"
						+ "by scholars. Loki has been depicted in or is referenced in a variety of media in modern popular \n"
						+ "culture."));

		godsList.add(new NorseGod("Baldr", "Aesir",
				"Baldr (also Balder, Baldur) is a Æsir god of light, joy, purity, and the summer sun in Norse mythology, \n"
						+ "and a son of the god Odin and the goddess Frigg. He is the father of Forseti, and He has numerous \n"
						+ "brothers, such as Thor and Váli.\n" + "\n"
						+ "In the 12th century, Danish accounts by Saxo Grammaticus and other Danish Latin chroniclers \n"
						+ "recorded a euhemerized account of his story. Compiled in Iceland in the 13th century, but based on \n"
						+ "much older Old Norse poetry, the Poetic Edda and the Prose Edda contain numerous references to \n"
						+ "the death of Baldr as both a great tragedy to the Æsir and a harbinger of Ragnarök. In addition to \n"
						+ "being loved by all gods and more physical beings, he was so handsome, generous, and good that he \n"
						+ "gave off light simply by the purity of his character.\n" + "\n"
						+ "According to Gylfaginning, a book of Snorri Sturluson's Prose Edda, Baldr's wife is Nanna and their \n"
						+ "son is Forseti. In Gylfaginning, Snorri relates that Baldr had the greatest ship ever built, Hringhorni, \n"
						+ "and that there is no place more beautiful than his hall, Breidablik."));

		godsList.add(new NorseGod("Sleipnir", "Other",
				"In Norse mythology, Sleipnir is an eight-legged horse ridden by Odin. Sleipnir is attested in the Poetic \n"
						+ "Edda, compiled in the 13th century from earlier traditional sources, and the Prose Edda, written in \n"
						+ "the 13th century by Snorri Sturluson. In both sources, Sleipnir is Odin's steed, is the child of Loki and \n"
						+ "Svaðilfari, is described as the best of all horses, and is sometimes ridden to the location of Hel. The \n"
						+ "Prose Edda contains extended information regarding the circumstances of Sleipnir's birth, and details \n"
						+ "that he is grey in color.\n" + "\n"
						+ "Sleipnir is also mentioned in a riddle found in the 13th century legendary saga Hervarar saga ok \n"
						+ "Heiðreks, in the 13th-century legendary saga Völsunga saga as the ancestor of the horse Grani, and \n"
						+ "book I of Gesta Danorum, written in the 12th century by Saxo Grammaticus, contains an episode \n"
						+ "considered by many scholars to involve Sleipnir. Sleipnir is generally accepted as depicted on two 8th \n"
						+ "century Gotlandic image stones: the Tjängvide image stone and the Ardre VIII image stone.\n"
						+ "\n"
						+ "Scholarly theories have been proposed regarding Sleipnir's potential connection to shamanic \n"
						+ "practices among the Norse pagans. In modern times, Sleipnir appears in Icelandic folklore as the \n"
						+ "creator of Ásbyrgi, in works of art, literature, software, and in the names of ships."));


		godsList.add(new NorseGod("Freyja", "Vanir",
				"In Norse mythology, Freyja is a goddess associated with love, sex, beauty, fertility, gold, seiðr, war, \n"
						+ "and death. Freyja is the owner of the necklace Brísingamen, rides a chariot pulled by two cats, \n"
						+ "accompanied by the boar Hildisvíni, and possesses a cloak of falcon feathers. By her husband Óðr, \n"
						+ "she is the mother of two daughters, Hnoss and Gersemi. Along with her twin brother Freyr, her \n"
						+ "father Njörðr, and her mother (Njörðr's sister, unnamed in sources), she is a member of the Vanir. \n"
						+ "Stemming from Old Norse Freyja, modern forms of the name include Freya, Freyia, and Freja.\n"
						+ "\n"
						+ "Freyja rules over her heavenly field Fólkvangr and there receives half of those that die in battle, \n"
						+ "whereas the other half go to the god Odin's hall, Valhalla. Within Fólkvangr lies her hall, Sessrúmnir. \n"
						+ "Freyja assists other deities by allowing them to use her feathered cloak, is invoked in matters of \n"
						+ "fertility and love, and is frequently sought after by powerful jötnar who wish to make her their wife. \n"
						+ "Freyja's husband, the god Óðr, is frequently absent. She cries tears of red gold for him, and searches \n"
						+ "for him under assumed names. Freyja has numerous names, including Gefn, Hörn, Mardöll, Sýr, \n"
						+ "Valfreyja, and Vanadís.\n" + "\n"
						+ "Freyja is attested in the Poetic Edda, compiled in the 13th century from earlier traditional sources; in \n"
						+ "the Prose Edda and Heimskringla, composed by Snorri Sturluson in the 13th century; in several Sagas \n"
						+ "of Icelanders; in the short story Sörla þáttr; in the poetry of skalds; and into the modern age in \n"
						+ "Scandinavian folklore.\n" + "\n"
						+ "Scholars have debated whether Freyja and the goddess Frigg ultimately stem from a single goddess \n"
						+ "common among the Germanic peoples; connected her connection to the valkyries, female battlefield \n"
						+ "choosers of the slain; and analyzed her relation to other goddesses and figures in Germanic \n"
						+ "mythology, including the thrice-burnt and thrice-reborn Gullveig/Heiðr, the goddesses Gefjon, Skaði, \n"
						+ "Þorgerðr Hölgabrúðr and Irpa, Menglöð, and the 1st century CE \"Isis\" of the Suebi. Freyja's name \n"
						+ "appears in numerous place names in Scandinavia, with a high concentration in southern Sweden. \n"
						+ "Various plants in Scandinavia once bore her name, but it was replaced with the name of the Virgin \n"
						+ "Mary during the process of Christianization. Rural Scandinavians continued to acknowledge Freyja as \n"
						+ "a supernatural figure into the 19th century, and Freyja has inspired various works of art."));

		godsList.add(new NorseGod("Heimdallr", "Aesir",
				"In Norse mythology, Heimdallr is a god who possesses the resounding horn Gjallarhorn, owns the golden-maned horse Gulltoppr, is called the shining god and the whitest of the gods, has gold teeth, and is the son of Nine Mothers (who may represent personified waves). Heimdallr is attested as possessing foreknowledge, keen eyesight and hearing, and keeps watch for invaders and the onset of Ragnarök while drinking fine mead in his dwelling Himinbjörg, located where the burning rainbow bridge Bifröst meets the sky. Heimdallr is said to be the originator of social classes among humanity and once regained Freyja's treasured possession Brísingamen while doing battle in the shape of a seal with Loki. Heimdallr and Loki are foretold to kill one another during the events of Ragnarök. Heimdallr is additionally referred to as Rig, Hallinskiði, Gullintanni, and Vindlér or Vindhlér.\n"
						+ "\n"
						+ "Heimdallr is attested in the Poetic Edda, compiled in the 13th century from earlier traditional material; in the Prose Edda and Heimskringla, both written in the 13th century by Snorri Sturluson; in the poetry of skalds; and on an Old Norse runic inscription found in England. Two lines of an otherwise lost poem about the god, Heimdalargaldr, survive. Due to the problematic and enigmatic nature of these attestations, scholars have produced various theories about the nature of the god, including his apparent relation to rams, that he may be a personification of or connected to the world tree Yggdrasil, and potential Indo-European cognates."));

		godsList.add(new NorseGod("Freyr", "Vanir",
				"Freyr (Old Norse: Lord), sometimes anglicized as Frey, is a widely attested god associated with sacral kingship, virility and prosperity, with sunshine and fair weather, and pictured as a phallic fertility god in Norse mythology. Freyr is said to \"bestow peace and pleasure on mortals\". Freyr, sometimes referred to as Yngvi-Freyr, was especially associated with Sweden and seen as an ancestor of the Swedish royal house.\n"
						+ "\n"
						+ "In the Icelandic books the Poetic Edda and the Prose Edda, Freyr is presented as one of the Vanir, the son of the sea god Njörðr, as well as the twin brother of the goddess Freyja. The gods gave him Álfheimr, the realm of the Elves, as a teething present. He rides the shining dwarf-made boar Gullinbursti and possesses the ship Skíðblaðnir which always has a favorable breeze and can be folded together and carried in a pouch when it is not being used. Freyr is also known to have been associated with the horse cult. He also kept sacred horses in his sanctuary at Thrandheim in Norway.[1] He has the servants Skírnir, Byggvir and Beyla.\n"
						+ "\n"
						+ "The most extensive surviving Freyr myth relates Freyr's falling in love with the female jötunn Gerðr. Eventually, she becomes his wife but first Freyr has to give away his sword which fights on its own \"if wise be he who wields it.\" Although deprived of this weapon, Freyr defeats the jötunn Beli with an antler. However, lacking his sword, Freyr will be killed by the fire jötunn Surtr during the events of Ragnarök."));

		
		godsList.add(new NorseGod("Bragi", "Aesir",
				"Bragi is generally associated with bragr, the Norse word for poetry. The name of the god may have been derived from bragr, or the term bragr may have been formed to describe 'what Bragi does'. A connection between the name Bragi and English brego 'chieftain' has been suggested but is generally now discounted. That Bragi is Odin's son is clearly mentioned only here and in some versions of a list of the sons of Odin (see Sons of Odin). But \"wish-son\" in stanza 16 of the Lokasenna could mean \"Odin's son\" and is translated by Hollander as Odin's kin."));


		BorderPane bPane = new BorderPane();
		bPane.setPadding(new Insets(10, 10, 10, 10));

		Text title = new Text("Norse Gods and other Beings");
		title.setFont(Font.font("TRON.TTF", FontWeight.BOLD, 25));
		bPane.setTop(title);

		Text name = new Text();
		name.setFont(Font.font("Impact", 20));

		Text race = new Text();
		race.setFont(Font.font("Arial", 12));

		Text desc = new Text();
		desc.setFont(Font.font("Helvetica", 20));

		TextFlow tFlow = new TextFlow(name, race, desc);
		tFlow.setPadding(new Insets(10, 10, 10, 10));
		tFlow.setLineSpacing(4);

		ScrollPane sPane = new ScrollPane();
		sPane.setContent(tFlow);
		sPane.setFitToWidth(true);
		sPane.setFitToHeight(true);
		sPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
		sPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

		bPane.setCenter(sPane);

		ObservableList<String> godsNames = godsList.stream().map(s -> s.getName())
				.collect(Collectors.toCollection(FXCollections::observableArrayList));
		ListView<String> list = new ListView<>(godsNames);
		list.setPrefWidth(150);
		bPane.setLeft(list);

		list.getSelectionModel().selectedIndexProperty().addListener(s -> {
			name.setText(godsList.get(list.getSelectionModel().getSelectedIndex()).getName() + "\n");
			race.setText(godsList.get(list.getSelectionModel().getSelectedIndex()).getRace() + "\n");
			desc.setText(godsList.get(list.getSelectionModel().getSelectedIndex()).getDesc());
		});

		Scene scene = new Scene(bPane, 800, 400);
		primaryStage.setTitle("Norse Gods");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
